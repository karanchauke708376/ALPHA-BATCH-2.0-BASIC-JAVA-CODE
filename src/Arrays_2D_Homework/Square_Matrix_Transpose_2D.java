package Arrays_2D_Homework;

public class Square_Matrix_Transpose_2D {

    public static void print_SquareMatrixTrasnspose(int Matrix[][]) {

        int Rows = Matrix[0].length;
        int Cols = Matrix[0].length;

        for(int i = 0; i < Rows; i++) {

            for(int j = i + 1; j < Cols; j++) {


                int temp = Matrix[i][j];
                Matrix[i][j] = Matrix[j][i];
                Matrix[j][i] = temp;
            }

        }

        for(int i = 0; i < Rows; i++) {

            for(int j = 0; j < Cols; j++) {

                System.out.print(Matrix[i][j] +"  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int Matrix[][] = {
                { 2, 3, 10, 43},
                { 1, 6, 87, 1},
                { 8, 9, 0, 54},
                { 7, 4, 2, 16} };

        print_SquareMatrixTrasnspose(Matrix);

    }

}
