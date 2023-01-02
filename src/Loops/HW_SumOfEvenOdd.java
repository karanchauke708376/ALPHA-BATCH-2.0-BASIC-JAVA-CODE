package Loops;

import  java.util.Scanner;
public class HW_SumOfEvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Numbers : ");

       // int n = sc.nextInt();

        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.println("Even Is :"+i);
            } else {
                sum2 += i;
                System.out.println("Odd Is :"+i);
            }
        }
        System.out.println("Sum Of Even Is "+sum);
        System.out.println("Sum Of Odd Is : "+sum2);

    }
}