from typing import List
class Solution:
    def subsetsWithDup(self, ind : int, nums: List[int], ds: List[int],
                       ans: List[List[int]]):
        ans.append(ds.copy())      
        for i in range(ind, len(nums)):  
            if(i!=ind & nums[i]==nums[i-1]): 
                continue
            ds.append(nums[i])
            self.subsetsWithDup(self, i+1, nums, ds, ans)
            ds.remove(nums[i])
                
if __name__ == "__main__":
    sol = Solution
    nums = [1,2,2]
    nums.sort()
    ans = []
    ds = []
    print(sol.subsetsWithDup(sol, 0, nums, ds, ans))
    ans.sort()
    print(ans)