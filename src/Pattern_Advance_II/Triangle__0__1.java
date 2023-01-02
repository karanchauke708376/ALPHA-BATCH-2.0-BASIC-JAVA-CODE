package Pattern_Advance_II;

public class Triangle__0__1 {

    public static void printriangle01(int n) {

        // Outer Loop For Line
        for(int i = 1; i <= n; i++) {

            // Inner Loop For print 0 1 But Condition check
            for(int j = 1; j <= i; j++) {

                if((i+j) % 2  == 0) {
                    // Even Number to Print 1
                    System.out.print("1 ");
                } else {
                    // Odd Number to print 0
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        printriangle01(5);

    }
}
