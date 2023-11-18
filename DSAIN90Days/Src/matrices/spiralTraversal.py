class Solution:
    def spiralOrder(self, matrix):
        '''
        :type matrix: list of list of int
        :rtype: list of int
        '''
        spiral_sequence = []

        if len(matrix) == 0:
            return spiral_sequence

        top_fence = 0
        bottom_fence = len(matrix) - 1
        left_fence = 0
        right_fence = len(matrix[0]) - 1

        while (top_fence <= bottom_fence and left_fence <= right_fence):
            # Walk top fence
            for col in range(left_fence, right_fence + 1):
                spiral_sequence.append(matrix[top_fence][col])
            top_fence += 1  # Push top fence in

            # Walk right fence
            for row in range(top_fence, bottom_fence + 1):
                spiral_sequence.append(matrix[row][right_fence])
            right_fence -= 1  # Close right fence in

            '''
                If center is a horizontal line, prevent the bottom from rereading what the
                top row already read.
            '''
            if top_fence <= bottom_fence:
                # Walk bottom fence
                for col in range(right_fence, left_fence - 1, -1):
                    spiral_sequence.append(matrix[bottom_fence][col])
            bottom_fence -= 1  # Close the bottom fence in

            '''
                If center is a vertical line, prevent the left from rereading what the right
                col already read.
            '''
            if left_fence <= right_fence:
                # Walk left fence
                for row in range(bottom_fence, top_fence - 1, -1):
                    spiral_sequence.append(matrix[row][left_fence])
                left_fence += 1  # Push to left fence in

        return spiral_sequence
    
    
if __name__ == "__main__":
    s = Solution
    s.spiralOrder(s, [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]])
