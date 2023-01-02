package Conditional_Statements;

public class Ternary_Operators {

    public static void main(String[] args) {

        // Ternary Operator

        int num = (5 > 3) ? 5 : 3 ;
        System.out.println(num);

        String Val = (8 % 2 == 0) ? "Even":"Odd";
        System.out.println(Val);

        int marks = 75;
        String reportCard = (marks >= 33) ? "Pass":"Fail";
        System.out.println(reportCard);

    }
}
