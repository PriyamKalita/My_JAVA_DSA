public class TwoDArrayQuestion {
    public static void transposeNoFirst(int matrix[][]) {
        System.out.println("The original matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // Question No. (1) : Print the number of 7’s that are inthe 2d array.
        /*
         * Example :
         * Input -
         * int[][] array = {{4,7,8},
         * {8,8,7} };
         * 
         * Output - 2
         */

        // int array[][] = {{ 4,7,8},
        // {8,8,7} };
        // int count = 0;
        // for(int i = 0; i < array.length; i++) {
        // for(int j = 0;j < array[0].length; j++) {
        // if(array[i][j] == 7) {
        // count++;
        // }
        // }
        // }
        // System.out.println("count of 7 is : " + count);

        // Question No. (2) : Print out the sum of the numbers in the second row of the
        // nums array.
        /*
         * Example :
         * Input -
         * int[][] nums = {{1,4,9},
         * {11,4,3},
         * {2,2,3} };
         * Output - 18
         */

        // int nums[][] = { { 1, 4, 9 },
        // { 11, 4, 3 },
        // { 2, 2, 3 } };

        // int sum = 0;
        // for (int i = 0; i < nums[0].length; i++) {
        // sum += nums[1][i];
        // }
        // System.out.println("sum is : " + sum);

        // Question No. (3) : Write a program to Find Transpose of a Matrix. What is
        // Transpose? Transpose of a matrix is the process ofswapping therows to
        // columns.
        // For a 2x3 matrix,
        /*
         * //Matrix
         * a11 a12 a13
         * a21 a22 a23
         * Transposed
         * // Matrix
         * a11 a21
         * a12 a22
         * a13 a23
         */
        int row = 2, col = 3;
        int matrix[][] = {{1, 2, 3},
                        { 4, 5, 6}};

        transposeNoFirst(matrix);

        int tans[][] = new int[col][row];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                tans[j][i] = matrix[i][j];
            }
        }
        transposeNoFirst(tans);
    }
}
