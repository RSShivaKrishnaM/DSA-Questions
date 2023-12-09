def f(col : int, m: int, n: int, res:[], matrix:[]):
    if(col == n):
        print(matrix)
    
    
    for row in range(0, m):
        if(isSpotSafe(matrix, row, col, m, n)):
            matrix[row][col] = 'Q'
            f(col + 1, m, n, res, matrix)
            matrix[row][col] = '.'

def isSpotSafe(matrix:[], row:int, col: int, m: int, n: int):
    
    for ind in range(0, m):
        if(matrix[ind][col]=='Q'):
            return False
    
    for ind in range(0, n):
        if(matrix[row][ind]=='Q'):
            return False
        
    r = 0
    c = 0    
    while r < m and c < n:
        if(matrix[r][c]=='Q'):
            return False
        r += 1    
        c += 1
        
    r = 0
    c = n
    while(r < m and c < n):
        if(matrix[r][c] == 'Q'): 
            return False
        r += 1    
        c -= 1
        
    return True
    
if __name__ == "__main__":
    res = []
    row, col = 5,5
    arr = [['.' for i in range(col)] for j in range(row)]
    f(0, row, col, res, arr)