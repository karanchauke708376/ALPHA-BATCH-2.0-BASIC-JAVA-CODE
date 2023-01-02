package Conditional_Statements;

import java.util.*;
import java.util.Scanner;
public class If_Else_OddEvenNo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Numbers To Check Odd Or Even : ");
        int n = sc.nextInt();

        if(n % 2 == 0) {

            System.out.println("Your Are Enter The Numbers Is Even : "+n);
        } else  {

            System.out.println("Your Are Enter The Numbers Is Odd : "+n);
        }

    }
}
