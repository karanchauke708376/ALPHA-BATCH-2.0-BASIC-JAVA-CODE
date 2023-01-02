package Arrays__2D;

import java.util.Scanner;

public class Intro_2D_Arrays_Search_Cells {

    public static boolean print_SearchIndex(int Matrix[][] , int key) {

        for(int i = 0; i < Matrix.length; i++) {

            for(int j = 0; j < Matrix.length; j++) {

                if(Matrix[i][j] == key) {
                    System.out.println("Found At Cell --- > (" + i +" , " + j+" )" );
                    return true;
                }
            }
        }
        System.out.println("Key Is Not Found ");
        return false;
    }

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

        print_SearchIndex(Matrix, 5);
    }

}
