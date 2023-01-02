package Conditional_Statements;

import java.util.Scanner;
public class Switch_Statements_II {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The A Value : ");
        int a = sc.nextInt();
        System.out.println("Enter The B Value : ");
        int b = sc.nextInt();
        System.out.println("Which Type Of Calculation : ");
        char operator = sc.next().charAt(0);

        switch (operator ) {
            case '+':
                System.out.println("A + B : " +(a+b));
                break;
            case '-':
                System.out.println("A - B : " +(a-b));
                break;
            case '*':
                System.out.println("A * B : "+(a*b));
                break;
            case '/':
                System.out.println("A / B : "+(a/b));
                break;
            case '%':
                System.out.println("A % B : "+(a%b));
                break;
            case '@':
                System.out.println("You Enter Wrong Sigh So Please Right Input : ");
                break;
            case '#':
                System.out.println("You Enter Wrong Sigh So Please Right Input : ");
                break;
            case '$':
                System.out.println("You Enter Wrong Sigh So Please Right Input : ");
                break;
            case '=':
                System.out.println("You Enter Wrong Sigh So Please Right Input : ");
                break;
            default:
                System.out.println("Thanks For Calculation :) ");

        }

    }
}
