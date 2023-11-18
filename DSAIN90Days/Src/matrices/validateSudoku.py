class Solution:
    def validSudoku(self, board):
        '''
        :type board: list of list of int
        :rtype: bool
        '''
        seen = {}

        for row in range(0, 9):
            for col in range(0, 9):
                v = board[row][col]

                if v != 0:
                    row_sig = "{}({})".format(row, v) #Verify row correctness.
                    col_sig = "({}){}".format(v, col) #Verify column correctness.
                    box_sig = "{}({}){}".format(row // 3, v, col // 3) #Verify box correctness.
                    # If any one is false return false
                    if (
                        row_sig in seen or
                        col_sig in seen or
                        box_sig in seen
                    ):
                        return False

                    seen[row_sig] = True
                    seen[col_sig] = True
                    seen[box_sig] = True

        return True
    
    
if __name__ == "__main__":
    s = Solution() 
    print(s.validSudoku( [
   ["5","3",".",".","7",".",".",".","."],
   ["6",".",".","1","9","5",".",".","."],
   [".","9","8",".",".",".",".","6","."],
   ["8",".",".",".","6",".",".",".","3"],
   ["4",".",".","8",".","3",".",".","1"],
   ["7",".",".",".","2",".",".",".","6"],
   [".","6",".",".",".",".","2","8","."],
   [".",".",".","4","1","9",".",".","5"],
   [".",".",".",".","8",".",".","7","9"]]))
