from typing import List

def subStringGen(inputStr : str):
    
    def recur(ind:int, inputStr: str, ans: str, res:[]):
        if(ind == len(inputStr)-1):
            res.append(ans)
            ans = ""
            return
        
        ind += 1
        recur(ind, inputStr, ans, res)
        s = inputStr[ind]
        recur(ind, inputStr, ans+s, res)
    
    
    res = []    
    recur(0, inputStr, "a", res)
    print(res)
    
if __name__ == "__main__":
    subStringGen("abc")