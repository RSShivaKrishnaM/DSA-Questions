from typing import List
class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        ele_count = {}
        for ele in nums:
            if ele in ele_count:
                ele_count[ele] = +1
            else:
                ele_count[ele] = 1
        
        for key, value in ele_count.items():
            print(f"{key} : {value}")

if __name__ == "__main__":
    sol = Solution
    print(sol.majorityElement(sol, [1,1,1,1]))