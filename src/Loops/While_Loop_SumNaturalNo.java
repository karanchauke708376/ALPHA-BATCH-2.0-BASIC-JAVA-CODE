package Loops;

import java.util.Scanner;
public class While_Loop_SumNaturalNo {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
       System.out.println("Enter The Range Of Numbers : ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= n) {

            sum += i;
            i++;
        }
        System.out.println("Sum Is Natural Numbers  : "+sum);

    }
}