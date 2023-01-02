package Arrays__2D;

public class StaircaseSearch_In_2DSortedMatrix_II {

    public static boolean print_StraicaseSearch_SortedMatrixII(int Matrix[][] , int key ) {

        int row = 0;
        int col = Matrix.length-1;

        for(int i = 0; i < Matrix[row][col]; i++) {

            if(Matrix[row][col] == key) {
                System.out.println("Key Is Find : (" +row+ "," + col + ")");
                return true;
            } else if (key < Matrix[row][col]) {
                col --;
            } else  {
                row ++;
            }

        }
        System.out.println("Key Is Not Found / Exist ");
        return false;
    }

    public static void main(String[] args) {

        int Matrix[][] = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 39, 48},
                {32, 33, 35, 50} };

        int key = 50;       // Find Key Search Index ?

        print_StraicaseSearch_SortedMatrixII(Matrix, key);

    }

}
