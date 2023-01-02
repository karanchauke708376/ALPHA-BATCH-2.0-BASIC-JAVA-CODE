package Basic_Programs_Java;

import java.util.*;
import java.util.Scanner;
public class Type_Casting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float a = 478.544f;
        int b = (int) a;
        System.out.println(b);

        float marks = 99.999f;
        int marks2 = (int) marks;
        System.out.println(marks2);
        System.out.println("--------------------------------");

        char ch = 'a';
        char ch1 = 'b';
        int number = ch;
        int number1 = ch1;
        System.out.println("The Ascii Value a Is : "+number);
        System.out.println("The Ascii Value b Is : "+number1);
        System.out.println("The Ascii Value Substraction Is : "+(ch-ch1));
        System.out.println("--------------------------------------------");

        int a1 = 10;
        float b1 = 20.25f;
        long c1 = 45l;
        double d1 = 75.5;
        double ans = a1 + b1 + c1 + d1;
        System.out.println("Sum Of Variables Values : " + ans);
        System.out.println("--------------------------------------------");

        byte b2 =  5;
        b2 = (byte) (b2 * 2);
        System.out.println("Byte Convert Int 5 * 2 : "+b2);

    }
}
