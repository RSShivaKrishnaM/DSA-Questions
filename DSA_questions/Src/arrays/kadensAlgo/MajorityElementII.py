from typing import List
import math
class Solution:
    def majorityElement_1(self, nums: List[int]) -> List[int]:
        ele_count = {}
        for ele in nums:
            if ele in ele_count:
                ele_count[ele] += 1
            else:
                ele_count[ele] = 1
        majorEle = []
        for key, value in ele_count.items():
            n = len(nums)
            if(value>math.floor(n/3)):
                majorEle.append(key)
        return majorEle

if __name__ == "__main__":
    sol = Solution
    print(sol.majorityElement_1(sol, [1,3,2,1]))