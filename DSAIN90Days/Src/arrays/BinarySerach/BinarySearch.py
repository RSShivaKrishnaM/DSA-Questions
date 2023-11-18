
def binarySearchEle(arr, ele):
    startInd = 0
    endInd = len(arr)
    midInd = (startInd + endInd) / 2
    for curr in arr:
        if curr < ele :
            startInd = minInd
            