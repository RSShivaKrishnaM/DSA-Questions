

def nextPermutation(listInt):
    index = -1
    for ind in range(len(listInt)-2,-1,-1):
        # print(listInt[ind])
        if listInt[ind] < listInt[ind+1]:
            index = ind
            break
        
    if(index == -1):
        listInt.reverse()
        return listInt
    
    if(index +1 == len(listInt)-1):
        listInt[index], listInt[index+1] = listInt[index+1], listInt[index]
        
    for ind in range(len(listInt)-1, index+1,-1):
        if(listInt[index] < listInt[ind]):
            listInt[index], listInt[ind] = listInt[ind], listInt[index]
            break
        
    subList = listInt[index+1:len(listInt)]
    subList.reverse()
    frontLIst = listInt[0:index+1]
    nextPerm = frontLIst + subList
    return nextPerm
    
if __name__ == "__main__":
    print(nextPermutation([1,3,2]))