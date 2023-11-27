import math
class Solution:
    def maxSubArray(self, nums):
        cur_max, max_till_now = 0, -math.inf
        for c in nums:
            cur_max = max(c, cur_max + c)
            max_till_now = max(max_till_now, cur_max)
        return max_till_now
    
if __name__ == "__main__":
    sol = Solution
    print(sol.maxSubArray(sol, [-2,1,-3,4,-1,2,1,-5,4]))