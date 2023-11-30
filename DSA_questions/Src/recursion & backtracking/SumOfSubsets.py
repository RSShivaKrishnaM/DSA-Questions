from typing import List
#User function Template for python3
class Solution:
    
    def compute(self, ind: int, sum: int, arr: List[int], N: int, sumSubSet: List[int]):
        if(ind == N):
            sumSubSet.append(sum)
            return
        self.compute(self, ind+1, sum + arr[ind], arr, N, sumSubSet)
        self.compute(self, ind+1, sum, arr, N, sumSubSet)
        
    def subsetSums(self, arr: int, N: int):
        sumSubSet = []
        self.compute(self, 0, 0, arr, N, sumSubSet)
        sumSubSet.sort()
        print(sumSubSet) 

#User function Template for python3
# class Solution:
#     def subsetSums(self, arr, N):
#         # code here
#         def wrapper(ind, arr, ans,  ds):
#             if ind == len(arr):
#                 sumV = sum(ds) if ds else 0
#                 ans.append(sumV)
#                 return
#             ds.append(arr[ind])
#             wrapper(ind + 1, arr, ans, ds)
#             ds.pop()
#             wrapper(ind + 1, arr, ans, ds)
#         ans = []
#         wrapper(0, arr, ans, [])
#         return ans
    
if __name__ == '__main__':
    sol = Solution
    arr = [2, 3]
    sol.subsetSums(sol, arr, len(arr))

