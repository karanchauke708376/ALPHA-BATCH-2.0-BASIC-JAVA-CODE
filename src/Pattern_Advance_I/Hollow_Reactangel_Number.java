package Pattern_Advance_I;

import java.util.Scanner;

public class Hollow_Reactangel_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter The Cols : ");
        int cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= cols; j++) {

                if (i == 1 || j == 1 || i == rows || j == cols) {

                    System.out.print(j +" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}