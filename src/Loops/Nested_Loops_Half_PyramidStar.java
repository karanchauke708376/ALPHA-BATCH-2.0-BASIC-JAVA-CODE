package Loops;

public class Nested_Loops_Half_PyramidStar {

    public static void main(String[] args) {

    int n = 5;

    // One Line
    for(int line = 1; line <=n; line++) {    // Number of line print
    // One Star
        for(int star = 1; star <=line; star++) {  // line equal to print star

            System.out.print("* ");
        }
        System.out.println();
    }



    }
}
