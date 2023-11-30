from typing import List
class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        def wrapper(ind: int, nums: List[int], res: List[List[int]], subList: List[int], N: int):
            if(ind == N):
                res.append(subList)
                subList.clear()
                return
            subList.append(nums[ind])
            wrapper(ind+1, nums, res, subList, N)
            subList.remove(nums[ind])
            wrapper(ind+1, nums, res, subList, N)
        
        res = [[]]
        subList = []
        wrapper(0, nums, res, subList, len(nums))    
        return res
            
if __name__ == "__main__":
    sol = Solution
    print(sol.subsetsWithDup(sol, [1,3,1,3]))