package Loops;

import java.util.Scanner;

public class HW_FactorialNo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number : ");
        int n = sc.nextInt();
        int fact = 1;

        for(int i = 1; i <= n; i++) {

            fact = fact * i;
        }
            System.out.println("Factorial Of "+n+" Is : "+fact);


    }
}