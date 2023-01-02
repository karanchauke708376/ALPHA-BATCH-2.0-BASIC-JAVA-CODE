package Arrays_2D_Homework;
public class Print_Number_7 {

    public static void print_Number(int Matrix[][], int key) {


        int count = 0;
        for(int i = 0; i < Matrix.length; i++){

            for(int j = 0; j < Matrix[0].length; j++) {

                if (Matrix[i][j] == key) {
                    count++;
                }
            }
        }
        System.out.println("7 Number Print Is "+count+" ");
    }
    public static void main(String[] args) {

        int Matrix[][] = {
                {4, 7, 8},
                {8, 8, 7, },
                {5, 8, 7} } ;

        int key = 7;

        print_Number(Matrix, 7);

    }

}
