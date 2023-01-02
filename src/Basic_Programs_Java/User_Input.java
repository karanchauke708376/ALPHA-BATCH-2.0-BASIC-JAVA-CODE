package Basic_Programs_Java;

import java.util.*;
import java.util.Scanner;

public class User_Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Name : ");
        String input = sc.next();
        System.out.println(input);

        System.out.println("Enter The Integer Number : ");
        int n = sc.nextInt();
        System.out.println(n);

        System.out.println("Enter The Flaot Number : ");
        float price = sc.nextFloat();
        System.out.println(price);

        System.out.println("Enter The Double Number : ");
        double a = sc.nextDouble();
        System.out.println(a);

        System.out.println("Enter The Long Number : ");
        long b = sc.nextLong();
        System.out.println(b);

        System.out.println("Enter The Boolean Value : ");
        boolean val = sc.nextBoolean();
        boolean val2 = sc.nextBoolean();
        System.out.println(val);
        System.out.println(val2);

        System.out.println("Enter The Short Value : ");
        short x = sc.nextShort();
        short y = sc.nextShort();
        System.out.println(x);
        System.out.println(y);





    }
}
