package Conditional_Statements;

import java.util.*;
import java.util.Scanner;

public class Else_if_Largest3No {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Value : ");
        int a = sc.nextInt();
        System.out.println("Enter B Value : ");
        int b = sc.nextInt();
        System.out.println("Enter C Value :");
        int c = sc.nextInt();

        if(a >= b && a >= c) {
            System.out.println("A Is Largest Of 3 Numbers : "+a);
        } else if (b >= c ) {
            System.out.println("B Is Largest Of 3 Numbers : "+b);
        }
        else {
            System.out.println("C Is Largest Of 3 Numbers : "+c);

        }


    }
}
