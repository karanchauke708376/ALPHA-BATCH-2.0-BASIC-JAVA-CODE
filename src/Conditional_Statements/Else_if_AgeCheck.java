package Conditional_Statements;

import java.util.*;
import java.util.Scanner;
public class Else_if_AgeCheck {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Age To Check : ");
        int age = sc.nextInt();

        if(age >= 18) {

            System.out.println("Adult : Drive , Vote ");
        }
        else if (age >= 13 && age < 18) {

            System.out.println("You Are Now Teenager : ");
        }
        else {

            System.out.println("Not Adult Now You :");
        }

    }
}
