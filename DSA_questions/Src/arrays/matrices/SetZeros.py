class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        rowList = []
        colList = []
        resMatrix = matrix

        m = len(matrix)
        n = len(matrix[0])
        for x in range(0, m):
            for y in range(0, n):
                if(matrix[x][y]==0):
                    rowList.append(x)
                    colList.append(y)
        
        
        for x in rowList:
            for col in range(0, n):
                matrix[x][col] = 0

        for y in colList:
            for x in range(0,m):
                matrix[x][y] = 0
