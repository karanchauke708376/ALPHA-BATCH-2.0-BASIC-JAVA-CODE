package Loops;

import java.util.Scanner;
public class While_Loop_ReverseNo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Make Reverse Numbers : ");
        int n = sc.nextInt();
        int rev = 0;

        while (n > 0) {
           int lastDigit = n % 10;
           rev = (rev * 10) + lastDigit;
           n = n / 10;
        }
        System.out.print(rev+" ");


    }
}
