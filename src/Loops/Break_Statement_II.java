package Loops;

import java.util.Scanner;
public class Break_Statement_II {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Keep Entering Numbers Till User Enter A Multiple of 10 : ");

        do {
            System.out.println("Enter Your Numbers : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);
    }
}
