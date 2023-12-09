class Solution:
    
    def func(self, ind: int, perm: [], res: [], set: []):    
        if(len(perm)==len(set)):
            res.append(perm.copy())
              
        for i in range(ind, len(set)):
            perm.append(set[i])
            set.remove(set[i])
            self.func(self, 0, perm, res, set)
            # perm.remove(set[i])
            
if __name__ == "__main__":
    sol = Solution
    res = []
    sol.func(sol, 0, [], res,[1,2,3])
    print(res)