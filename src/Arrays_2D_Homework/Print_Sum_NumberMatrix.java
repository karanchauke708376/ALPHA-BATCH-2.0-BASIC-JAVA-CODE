package Arrays_2D_Homework;

public interface Print_Sum_NumberMatrix {

    public static int print_SecondRowSum(int Matrix[][]) {

        // O(N^2)

        int sum = 0 ;

        for(int i = 0; i < Matrix.length; i++) {

            for(int j = 0; j < Matrix.length; j++) {

                if(i == 1) {
                    sum += Matrix[i][j];
                }
            }

        }
        return sum;
    }

    public static void main(String[] args) {

        int Matrix[][] = {
                {1, 4, 9},
                {11, 4, 3},
                {2, 2, 3} } ;


        System.out.println("Sum Of Second Rows : "+ print_SecondRowSum(Matrix));

    /*     O(N)
     int sum = 0;

        for(int j = 0; j < Matrix[0].length; j++) {
            sum += Matrix[1][j];
        }

        System.out.println("Sum Is : " + sum);   */

    }

}
