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
                # sel.remove(num)
    
    
if __name__ == "__main__":
    sol = Solution
    choices = [2,3,5]
    target = 8
    sel = []
    res = []
    sol.combinationSum(sol, choices, 8, sel, res)
    print(res)