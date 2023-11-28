# https://leetcode.com/problems/majority-element/submissions/1107957365/
# ele count > n/2
from typing import List
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        counter = 0
        ele = nums[0]
        count = 1
        for i in range(1, len(nums)):
            if(count == 0):
                ele = nums[i]
            if(nums[i] == ele):
                count += 1
            else:
                count -= 1 
        return ele
    
    def majorityElement_2(self, nums: List[int]) -> int:
        dic = {}
        res = []
        n = len(nums)
        for num in nums:
            if num in dic:
                dic[num] += 1 
                if(dic[num]>n/2):
                    res.append(num)
            else:
                dic[num] = 1
        return set(res)
    

if __name__ == "__main__":
    sol = Solution
    # sol.majorityElement(sol,[1,2,1,1,1])
    print(sol.majorityElement_2(sol,[1,2,3,1,1,1,1,1]))