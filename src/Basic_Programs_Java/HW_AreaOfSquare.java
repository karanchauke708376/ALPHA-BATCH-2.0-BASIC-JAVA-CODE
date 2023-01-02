package Basic_Programs_Java;

import java.util.*;
import java.util.Scanner;
public class HW_AreaOfSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Square Of Side :  ");
        int Side = sc.nextInt();


        float areaofsq = Side * Side ;

        System.out.println("Area Of Square Is : " +areaofsq);

    }
}
