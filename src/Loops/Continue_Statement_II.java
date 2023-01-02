package Loops;

import java.util.Scanner;

public class Continue_Statement_II {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Numbers : ");

        do {
        int n = sc.nextInt();
        if(n % 10 == 0) {
            continue;
        }
            System.out.println("Number Was : "+n);
        } while (true);
    }
}
