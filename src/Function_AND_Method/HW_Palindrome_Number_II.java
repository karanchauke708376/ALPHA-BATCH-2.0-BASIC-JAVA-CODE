package Function_AND_Method;

import java.util.Scanner;

public class HW_Palindrome_Number_II {
    public static boolean isPalindrome(int number) {

        // Copied Number into variable
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {

            int remainder = palindrome % 10;
            reverse = remainder * 10 + remainder;
            palindrome = palindrome / 10;
        }

        /* if original and the reverse of number is equal means
        number is palindrome   */

        if (number == reverse) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Check Palindrome or Not : ");
        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome)) {
            System.out.println("Number : "+ palindrome + " is a Palindrome.");
        } else  {
            System.out.println("Number : " + palindrome + " is a not Palindrome.");

        }
    }
}