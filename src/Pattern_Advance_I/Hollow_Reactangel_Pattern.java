package Pattern_Advance_I;

import java.util.Scanner;

public class Hollow_Reactangel_Pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Rows Pattern : ");
        int rows = sc.nextInt();
        System.out.println("Enter Your Cols Pattern : ");
        int cols = sc.nextInt();


        for(int i = 1; i <= rows; i++) {

            for(int j = 1; j <= cols; j++) {

                if(i == 1 || j == 1 || i == rows || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            System.out.println();

        }

    }
}
