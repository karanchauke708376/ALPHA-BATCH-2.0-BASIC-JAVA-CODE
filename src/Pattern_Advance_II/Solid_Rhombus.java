package Pattern_Advance_II;

public class Solid_Rhombus {

    public static void solid_rhombus(int n) {

        // Outer Loop For Line
        for(int i = 1; i <= n; i++){
            // Inner Loop For Spaces
            for(int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            // Inner loop For Stars
            for(int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        solid_rhombus(5);

    }

}
