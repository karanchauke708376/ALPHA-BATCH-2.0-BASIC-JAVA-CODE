package Loops;

import java.util.Scanner;
public class While_Loop_PrintNoUser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Print Range : ");
        int range = sc.nextInt();
        int counter = 1;

        while (counter <= range) {
            System.out.println(counter);
            counter++;

        }

        System.out.println("Your Range : " + counter);


    }
}
