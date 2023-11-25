from functools import reduce


class Solution:
    def threeSum(self, A):
        '''
        :type A: list of int
        :rtype: list of list of int
        '''
        #Initially sorting is required
        A.sort()
        
        # make a set to avoid duplicate
        seen = set()
        # This will store the answer
        all_three_sums = []
        second_to_last_index = len(A) - 2

        for i in range(0, second_to_last_index):
            self.find_two_sum(i, A, all_three_sums, seen)

        return all_three_sums

    def find_two_sum(self, root_index, A, all_three_sums, seen):
        left = root_index + 1
        right = len(A) - 1
        # loop till left < right
        while left < right:
            three_number_sum = A[root_index] + A[left] + A[right]
            # Case when an answer is found
            if three_number_sum == 0:
                number_list = [A[root_index], A[left], A[right]]
                number_list.sort()
                signature = reduce(lambda acc, num: str(
                    acc) + str(num), number_list)

                if signature not in seen:
                    all_three_sums.append([A[root_index], A[left], A[right]])
                    seen.add(signature)
                # if ans exist than increase left index as well as decrease right index
                left += 1
                right -= 1
            elif three_number_sum < 0: # if sum< 0 only increase left index to get larger sum
                left += 1
            else:
                right -= 1 # if sum>0 only decrease right index to get lesser sum
