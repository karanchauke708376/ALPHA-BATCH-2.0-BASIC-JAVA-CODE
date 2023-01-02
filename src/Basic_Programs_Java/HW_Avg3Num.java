package Basic_Programs_Java;

import java.util.Scanner;
public class HW_Avg3Num {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The A Values : ");
        int A = sc.nextInt();

        System.out.println("Enter The B Values : ");
        int B = sc.nextInt();

        System.out.println("Enter The C Values : ");
        int C = sc.nextInt();

        float Sum = A + B + C;
        float Avg = Sum / 3;

        System.out.println("Sum Of Three Numbers A B C Is : "+Sum);
        System.out.println("Average Of Three Numbers A B C Is : "+Avg);





    }
}
