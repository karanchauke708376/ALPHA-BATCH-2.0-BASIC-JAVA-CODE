package Arrays_2D_Homework;

public interface Transpose_2D_Matrix {

    public static void print_2D_Transpose(int Matrix[][])  {

        int Rows = Matrix.length;
        int Cols = Matrix.length;

        int Transpose[][] = new int[Rows][Cols];

        for(int i = 0; i < Rows; i++) {

            for(int j = 0; j < Cols; j++) {

                Transpose[j][i] = Matrix[i][j];
            }
        }

        for(int i = 0; i < Rows; i++) {

            for(int j = 0; j < Cols; j++) {

                System.out.print(Transpose[i][j]+" ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {

     /*   int Matrix[][] = {
                {78, 64, 51},
                {15, 36, 61},
                {67, 94, 57} } ;   */

            int Matrix[][] = {
                    {84, 67},
                    {18, 69} } ;

        print_2D_Transpose(Matrix);

    }

}
