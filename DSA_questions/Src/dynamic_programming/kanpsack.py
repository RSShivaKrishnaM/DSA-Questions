

import sys


def recur(ind: int, W: int, wt: [], val: []) -> int:
    if(ind < 0):
        return 0
    notTake = 0 + recur(ind-1, W, wt, val)
    take =  -sys.maxsize-1
    if(wt[ind] <= W):
        take = val[ind] + recur(ind-1, W -wt[ind], wt, val)
    
    return max(notTake, take)
    
def recurMemoDP(ind: int, w: int, wt: [], val: [], dp:[]) -> int: #time complexity O(N*W) space O(N*W)
    if(ind < 0):
        return 0
    if(dp[ind][w]!=-1):
        return dp[ind][w]
    notTake = 0 + recurMemoDP(ind-1, W, wt, val, dp)
    take =  -sys.maxsize-1
    if(wt[ind] <= W):
        take = val[ind] + recurMemoDP(ind-1, W -wt[ind], wt, val, dp)
        
    dp[ind][w] = max(notTake, take)
    return dp[ind][w] 

def memoDP(N: int, w: int, wt: [], val: [], dp:[]) -> int: #time complexity O(N*W) space O(N*W)
    
    for i in range(w+1): 
        dp[0][i] = val[0]
    
    for i in range(1, N):
        for j in range(w+1):
            notTake = 0 + dp[i-1][j]
            take = -sys.maxsize -1
            if(wt[i]<=w):
                take = val[i] + dp[i][w - wt[i]]
            dp[ind][w] = max(take, notTake)
            
    return dp[N-1][w]

def memoDP_2(N: int, maxw: int, wt: [], val: []) -> int: #time complexity O(N*MAXW) space O(N*W)
    prev = [0 for x in range(maxw+1)]
    cur = [0 for x in range(maxw+1)]
    for i in range(maxw+1): 
        prev[i] = val[0]
    
    for i in range(1, N):
        for j in range(maxw+1):
            notTake = 0 + prev[j]
            take = -sys.maxsize -1
            if(wt[i]<=maxw):
                take = val[i] + prev[maxw-wt[i]]
            cur[j] = max(take, notTake)
        prev = cur
            
    return prev[maxw]

if __name__ == "__main__":
    wt = [6,1,5,3]
    val = [3,6,1,4]
    N = 4
    
    W = 10
    ind = N -1
    dp = [[0 for x in range(W+1)] for y in range(N)]
    # print(recur(ind, W , wt, val))
    # print(recurMemoDP(ind, W , wt, val, dp))
    # print(memoDP(N, W, wt, val, dp))
    print(memoDP_2(N, W, wt, val))

