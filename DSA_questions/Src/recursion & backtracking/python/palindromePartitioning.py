class Solution:
    def partition(self, s: str):
        res = []
        path = []
        self.fun(self, 0, s, path, res)
        print(res)
        
    def fun(self, ind: int, s: str, path: [], res: []):
        if(ind == len(s)):
            res.append(path)
            return
        for i in range(ind, len(s)):
            if(self.isPalindrome(self, s, i, ind)):
                path.append(s[ind:i+1])
                self.fun(self, i+1, s, path, res)
                path.remove(len(path)-1)
        
    def isPalindrome(self, s:str, start: int , end: int) ->  bool:
        while(start <= end):
            start += 1
            end -= 1
            print(start)
            if(s[start] != s[end]):
                return False
        return True
    
if __name__ == "__main__":
    sol = Solution
    sol.fun(sol, 0, 'aab', [], [])