def recusiveFun(ind, prevInd, arr, n, dp):
    if(ind == n):
        return 0
    if(dp[ind][prevInd+1] != -1):
        return dp[ind][prevInd+1]
    # not take ind
    len = 0 + recusiveFun(ind+1, prevInd, arr, n, dp)
    if(prevInd == -1 or arr[ind] > arr[prevInd]):
        len = max(len, 1 + recusiveFun(ind+1, ind, arr, n, dp)) # take
        
    dp[ind][prevInd+1] = len
    return len

if __name__ == "__main__":
    arr = [1,2,3,4,5,6]
    row, col = len(arr),len(arr)
    dp = [[-1 for i in range(col)] for j in range(row)]
    len = recusiveFun(0, -1, arr, len(arr), dp )
    print(len)