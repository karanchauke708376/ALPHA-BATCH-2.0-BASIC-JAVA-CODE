package Function_AND_Method;

import java.util.Scanner;

public class HW_Palindrome_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Check Palindrome : ");
        int num = sc.nextInt();
        int temp = num;
        int reverse = 0;

        while (temp != 0) {

            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;

            temp = temp / 10;

        }
            if(temp == reverse) {

                System.out.println("Palindrome Number : ");
            } else {
                System.out.println("Not Palindrome Number : ");
            }
    }
}
