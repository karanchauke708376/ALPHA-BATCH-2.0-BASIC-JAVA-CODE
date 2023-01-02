package Arrays__2D;

import java.util.Scanner;

public class Intro_2D_Arrays_Print {

    public static void main(String[] args) {

        System.out.println("Enter The 2D Arrays Rows and Columns : ");

        int Matrix[][] = new int[3][3];
        int n = Matrix.length, m = Matrix.length;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                Matrix[i][j] = sc.nextInt();
            }

        }
                    // Output Print
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                System.out.print(Matrix[i][j]+" ");

            }
            System.out.println();
        }
    }
}