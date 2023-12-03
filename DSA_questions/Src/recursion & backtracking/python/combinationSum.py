from typing import List
class Solution:
    def combinationSum(self, choices : List[int], target: int, sel: List[int], res: List[List[int]] ):
        if(target == 0):
            res.append(sel.copy())
            sel.clear()
        
        for num in choices:
            if(target < num):
                continue
            else:
                sel.append(num)
                self.combinationSum(self, choices, target - num, sel, res)   
                if(len(sel)!=0):
                   sel.remove(num)
                   target = target + num
    
    def combinationSum_1(self, choices: [] , ind: int, target: int, ans: [], ds: [] ):
        if(ind == len(choices)):
            if(target == 0):
                ans.append(ds.copy())
            return
        
        if(choices[ind] <= target):
            ds.append(choices[ind])
            self.combinationSum_1(sol, choices, ind, target - choices[ind], ans, ds)
            ds.remove(choices[ind])
        
        self.combinationSum_1(self, choices, ind+1, target, ans, ds)
        
        
        
        
    
if __name__ == "__main__":
    sol = Solution
    choices = [2,3,5]
    target = 8
    sel = []
    res = []
    ans = []
    # sol.combinationSum(sol, choices, 8, sel, res)
    sol.combinationSum_1(sol, choices, 0, 8,  ans, res)
    print(ans)