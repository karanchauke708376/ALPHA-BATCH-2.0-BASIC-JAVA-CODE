package Arrays__2D;

public class Diagonal_Sum_TC_Big_O_N_Square {

    // TC Time Complexity - O(N Square)
    public static int print_diagonalSum(int Matrix[][]) {   //O(n^2)

        int sum = 0;
        for (int i = 0; i < Matrix.length; i++) {

            for (int j = 0; j < Matrix[0].length; j++) {

                if (i == j) {
                    sum += Matrix[i][j];  // Primary Sum Of Diagonal

                } else if (i + j == Matrix.length - 1) {
                    sum += Matrix[i][j];  // Secondary Sum Of Diagonal
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        int Matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16} };

        System.out.println("Diagonal Of Sum Is : "+print_diagonalSum(Matrix));

    }

}
