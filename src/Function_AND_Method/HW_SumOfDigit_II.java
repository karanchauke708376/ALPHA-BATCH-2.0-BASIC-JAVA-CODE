package Function_AND_Method;

import java.util.Scanner;

public class HW_SumOfDigit_II {

    public static int sumDigits(int n) {

        int sumofdigits = 0;
        while (n > 0) {

            int lastdigit = n % 10;
            sumofdigits = sumofdigits + lastdigit;
            n = n / 10;
        }
        return sumofdigits;
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Numbers : ");
        int digits = sc.nextInt();
        System.out.println("The Sum Of Digit : "+sumDigits(digits));
    }
}
