package Loops;

import java.util.Scanner;
public class For_Loop_PrimeOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int n = sc.nextInt();

        if(n == 2) {
            System.out.println("N Is Prime : ");
        } else {
            boolean isPrime = true;
            for(int i = 2; i <= n-1; i++) {
                if(n % i == 0) {  // n is multiple of i ( i not equal to 1 or n)
                    isPrime = false;
                }
            }

            if(isPrime == true) {
                System.out.println("N Is Prime");
            } else {
                System.out.println("N Is Not Prime");
            }
        }


    }

}
