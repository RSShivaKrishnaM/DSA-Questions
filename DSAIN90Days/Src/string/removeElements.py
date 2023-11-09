

class Solution:
    count = 0
    def removeElement(self, nums: list[int], val: int) -> int:
        for num in nums:
            if num == val :
                self.count+=1

        while self.count > 0 :
            nums.remove(val)
            self.count -= 1
        print(nums)    
        return len(nums)
    

def main():
    s = Solution 
    print(s.removeElement(s, [0,1,2,2,3,0,4,2], 2))
    
if __name__ == "__main__":
    main()