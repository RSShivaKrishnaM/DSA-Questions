from typing import List
import math
class Solution:
    def majorityElement_1(self, nums: List[int]) -> List[int]:
        ele_count = {}
        for ele in nums:
            if ele in ele_count:
                ele_count[ele] += 1
            else:
                ele_count[ele] = 1
        majorEle = []
        for key, value in ele_count.items():
            n = len(nums)
            if(value>math.floor(n/3)):
                majorEle.append(key)
        return majorEle
    
    def majorityElement_2(self, nums: List[int]) -> List[int]:
        majorEle = []
        cont_1 = 0
        cont_2 = 0
        ele1 = nums[cont_1]
        ele2 = nums[cont_2]
        
        for num in nums:
            if(cont_1==0 & num!=ele2):
                cont_1 = 1
                ele1 = num
            elif(cont_2==0 & num!=ele1):
                cont_2 = 1
                ele2 = num
            elif(ele1==num):
                cont_1 += 1
            elif(ele2==num):
                cont_2 += 1
            else:
                cont_1 -= 1
                cont_2 -= 1
        cont_1=0
        cont_2=0
        for num in nums:
            if num == ele1:
                cont_1 += 1
            if num == ele2:
                cont_2 += 1
                
        if(cont_1 >= len(nums)/3 +1):
            majorEle.append(ele1)
        if(cont_2 >= len(nums)/3 +1):
            majorEle.append(ele2)
        
        return majorEle

if __name__ == "__main__":
    sol = Solution
    print(sol.majorityElement_1(sol, [1,3,2,1,2]))