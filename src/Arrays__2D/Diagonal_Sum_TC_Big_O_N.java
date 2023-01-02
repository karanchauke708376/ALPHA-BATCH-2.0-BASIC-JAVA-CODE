package Arrays__2D;

public class Diagonal_Sum_TC_Big_O_N {

    public static int print_DiagonalSum(int Matrix[][]) {

        int Sum = 0;

        for (int i = 0; i < Matrix.length; i++) {
            Sum += Matrix[i][i];    // Primary Diagonal Sum

            if (i != Matrix.length - 1 - i) {
                Sum += Matrix[i][Matrix.length - 1 - i]; // Secondary Diagonal Sum
            }
        }
        return Sum;
    }

    public static void main(String[] args) {

      /*  int Matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16} };   */


        int Matrix[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9} };

        System.out.println("Diagonal Sum Of Is : "+ print_DiagonalSum(Matrix));

    }
}
