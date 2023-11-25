package Math;

public class RotateMatrix {

    public int[][] rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int size = matrix.length -1;
        int layers = row / 2;
        for(int layer = 0; layer < layers ; layer++){
            for(int j= layer ; j < size -layer ; j++){
                int top = matrix[layer][j];
                int right = matrix[j][size - layer];
                int bottom = matrix[size-layer][size-j];
                int left = matrix[size-j][layer];
                matrix[layer][j] = left;
                matrix[j][size-layer]=top;
                matrix[size-layer][size-j]=right;
                matrix[size-j][layer]=bottom;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        RotateMatrix rm = new RotateMatrix();

        for (int[] ints : matrix) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(ints[col]);
                System.out.print(",");
            }
            System.out.println();
        }

        System.out.println("\n");

        int[][] mat = rm.rotate(matrix);
        for (int[] ints : mat) {
            for (int col = 0; col < mat[0].length; col++) {
                System.out.print(ints[col]);
                System.out.print(",");
            }
            System.out.println();
        }
    }
}
