package Arrays__2D;

public class StaircaseSearch_In_2DSortedMatrix {

    public static boolean print_StaircaseSearch_SortedMatrix(int Matrix[][], int key) {

        int row = 0 ;
        int col = Matrix.length-1;

        while (row < Matrix.length && col >= 0) {

            if(Matrix[row][col] == key) {
                System.out.println("Found Key At (" + row + "," + col + ")" );
                return true;

            } else if (key < Matrix[row][col]) {
                col--;           //    Left  < ------------

            } else {
                row++;         //    Down |
            }
        }
        System.out.println("Key Not Found/ Exist");
        return false;
    }
    public static void main(String[] args) {

        int Matrix[][] = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50} };

        int key = 33;       // Find Index Of Key ?

        print_StaircaseSearch_SortedMatrix(Matrix, key);

    }


}
