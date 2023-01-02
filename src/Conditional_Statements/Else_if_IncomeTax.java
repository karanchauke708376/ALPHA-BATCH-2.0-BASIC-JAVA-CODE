package Conditional_Statements;

import java.util.*;
import java.util.Scanner;
public class Else_if_IncomeTax {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Your Income : ");
        Double Income = sc.nextDouble();
        Double Tax;
        Double TaxAmt;

        if(Income < 500000) {

            Tax = (0.0 * Income);
            System.out.println("Your Income Is : " + Income);
            TaxAmt = Income - Tax;
            System.out.println("GST 0% Tax On Your Income : "+Tax);
            System.out.println("Your Are Now Income Is : "+TaxAmt);

          ///  System.out.println(Income);

            }
        else if (Income >= 500000 && Income < 1000000 ) {

            Tax = (0.20 * Income);
            System.out.println("Your Income Is : " + Income);
            TaxAmt = Income - Tax;
            System.out.println("GST 20% Tax On Your Income : "+Tax);
            System.out.println("Your Are Now Income Is : "+TaxAmt);

        } else {

            Tax = (0.30 * Income);
            System.out.println("Your Income Is : " + Income);
            TaxAmt = Income - Tax;
            System.out.println("GST 30% Tax On Your Income : "+Tax);
            System.out.println("Your Are Now Income Is : "+TaxAmt);
        }

    }
}
