package Pattern_Advance_II;

public class Inverted_Rotated_Half_Pyramid {
    public static void InvRotHalf(int n) {

        // Outer loop for line
        for(int i = 1; i <= n; i++) {

            // Inner Loop for spaces
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // star
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {

        InvRotHalf(10);

    }

}
