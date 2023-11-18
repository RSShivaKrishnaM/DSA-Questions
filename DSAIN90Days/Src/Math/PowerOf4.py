# def isPowerOf4(input:int):
#         i = 0
#         pow4 = 1
#         while input >= pow4 :
#             if input == pow4 :
#                 return True
#             pow4 = 4**i
#             i+=1
        
#         return False
            
              
# def isPowerOf4_2(input:int):
#     alternatingOddBitMask = 0x55555555  # 1010101010101010101010101010101

#     isNonZero = input != 0
#     hasSingleLeadingOneBit = (input & (input - 1)) == 0
#     hasOnlyOddPositionedBits = (input & alternatingOddBitMask) == input

#     return isNonZero and hasSingleLeadingOneBit and hasOnlyOddPositionedBits
# def isPowerOf4_1(n:int):
#     if n <= 0:
#         return False
#     return math.log(n,4).is_integer()
       
# def function2():
#     print(isPowerOf4_1(8))
    
# if __name__ == "__main__":
#     function2()
    