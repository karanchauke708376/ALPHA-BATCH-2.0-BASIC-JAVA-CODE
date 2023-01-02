package Function_AND_Method;

import java.util.Scanner;

public class Function_Parameter {

    // Parameters or formal parameters --- > a and b
    public static int CalSum(int num1, int num2) {

        int sum = num1 + num2 ;
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The A Value : ");
        int a = sc.nextInt();
        System.out.println("Enter The B Value : ");
        int  b = sc.nextInt();

        // Arguments / Actual Parameters -- > a , b
        int sum = CalSum(a , b);

        System.out.println("Sum Of A and B Is : "+ sum);

        CalSum(a, b);
    }
}
