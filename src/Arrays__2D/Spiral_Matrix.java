package Arrays__2D;
public class Spiral_Matrix {

    public static void print_SpiralMatrix(int Matrix[][]) {

        int StartRow = 0;
        int StartCol = 0;
        int EndRow = Matrix.length - 1;
        int EndCol = Matrix.length - 1;

        while (StartRow <= EndRow && StartCol <= EndCol) {

            // Top
            for (int j = StartCol; j <= EndCol; j++) {
                System.out.print(Matrix[StartRow][j] + " ");
            }

            // Right
            for (int i = StartCol + 1; i <= EndRow; i++) {
                System.out.print(Matrix[i][EndCol] + " ");
            }

            // Bottom
            for (int j = EndCol - 1; j >= StartCol; j--) {
                if (StartRow == EndRow) {
                    break;
                }
                System.out.print(Matrix[EndRow][j] + " ");
            }

            // Left
            for (int i = EndRow - 1; i >= StartRow + 1; i--) {
                if (StartCol == EndCol) {
                    break;
                }
                System.out.print(Matrix[i][StartCol] + " ");
            }
            StartCol++;
            StartRow++;
            EndCol--;
            EndRow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //        4 x 4

        int Matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

     //         3 x 3

//        int Matrix[][] = {
//                {1, 2, 3,},
//                {4, 5, 6},
//                {7, 8, 9}, }


        print_SpiralMatrix(Matrix);
    }
}
