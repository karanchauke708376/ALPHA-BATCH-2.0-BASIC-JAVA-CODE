package Basic_Programs_Java;

import java.util.*;
import java.util.Scanner;
public class UserInput_Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The A Values : ");
        int a = sc.nextInt();
        System.out.println("Enter The B Values : ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum Of A and B : " + sum);
    }

}
