def recursiveApproach(ind1: int, ind2: int, text1: str, text2: str):
    
    if(ind1 < 0 or ind2 < 0):
        return 0
    
    if(text1[ind1]==text2[ind2]):
        return 1 + recursiveApproach(ind1-1, ind2-1, text1, text2)
    
    return max(recursiveApproach(ind1-1, ind2, text1, text2), recursiveApproach(ind1, ind2-1, text1, text2))    
    
def dpApproach(self, ind1: int, ind2: int, text1: str, text2:str, dp: []):
        if(ind1 < 0 or ind2 < 0):
            return 0

        if(dp[ind1][ind2] != -1):
            return dp[ind1][ind2]

        if(text1[ind1]==text2[ind2]):
            dp[ind1][ind2] = 1 + self.dpApproach(ind1-1, ind2-1, text1, text2, dp)
            return dp[ind1][ind2]
        dp[ind1][ind2] = max(self.dpApproach(ind1-1, ind2, text1, text2, dp) , self.dpApproach(ind1, ind2-1, text1, text2, dp))  
        return dp[ind1][ind2]


if __name__ == "__main__":
    # res = recursiveApproach(4, 2, 'abcde', 'ace')
    text1 = 'abcde'
    text2 = 'ace'
    dp = [[-1 for i in range(len(text2))] for j in range(len(text1))]
    res_dp = dpApproach(len(text1)-1, len(text2)-1, text1, text2, dp)
    print(res_dp)
