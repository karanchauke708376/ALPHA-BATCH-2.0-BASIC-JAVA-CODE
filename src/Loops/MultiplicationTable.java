package Loops;

import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Table Number :");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            int mult = n * i;
            System.out.println(n+" X "+i+" = "+mult);
        }

    }
}
