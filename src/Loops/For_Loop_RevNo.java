package Loops;

import java.util.Scanner;
public class For_Loop_RevNo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Check Reverse Number :");
        int n = sc.nextInt();
        int lastDigit ;
        while(n > 0) {
            lastDigit = n % 10;
            System.out.print(lastDigit+" ");
            n = n / 10;
        }
        System.out.println();
    }
}
