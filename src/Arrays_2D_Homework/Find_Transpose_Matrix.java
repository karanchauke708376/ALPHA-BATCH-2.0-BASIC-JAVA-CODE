package Arrays_2D_Homework;

public class Find_Transpose_Matrix {

    public static void print_SwappingRow(int Matrix[][]) {


        int row = Matrix.length;   // Find The Number Of Rows  -- > N ( Number Of Rows 2)
        int col = Matrix[0].length;  // Find The Number Of Column  -- > M ( Number Of Column 3 )

        // Create Empty Transpose Matrix Of Size M*N
        int Transpose[][] = new int[col][row];

        // Traverse Of 2D Matrix Arrays
        for(int i = 0; i < row; i++) {

            for(int j = 0; j < col; j++) {

                // Assign Transpose[j][i] as Matrix[i][j]
                Transpose[j][i] = Matrix[i][j];

            }
        }

        // Output The Transpose Matrix
        for(int i = 0; i < col; i++) {

            for(int j = 0; j < row; j++) {

                System.out.print(Transpose[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int Matrix[][] = {
                {11, 12, 13},
                {21, 22, 23} };

        print_SwappingRow(Matrix);
    }

}
