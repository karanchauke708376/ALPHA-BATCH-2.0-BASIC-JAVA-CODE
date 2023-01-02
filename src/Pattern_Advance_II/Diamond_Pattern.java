package Pattern_Advance_II;

public class Diamond_Pattern {

    public static void diamondpattern(int n) {

        // Outer Looop For Line
        for(int i = 1; i <= n; i++) {

            // Inner Loop For Space
            for(int j = 1; j <= (n-i); j++){
                System.out.print("  ");
            }
                // Innner Looop For Star
            for(int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }
        for(int i = n; i >= 1; i--) {

                // Inner Loop For Space
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                // Innner Looop For Star
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }
            System.out.println();
            }
        }
    public static void main(String[] args) {

        diamondpattern(7);

    }

}
