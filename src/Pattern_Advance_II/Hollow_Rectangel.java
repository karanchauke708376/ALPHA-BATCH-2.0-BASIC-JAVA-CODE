package Pattern_Advance_II;

public class Hollow_Rectangel {

    public static void hollow_rectangle(int toRows , int toCols ) {

        // Outer Loops = Rows Print
        for(int i = 1; i <= toRows; i++ ){
            // Inner Loops = Columns
            for(int j = 1; j <= toCols; j++) {
                    // Boundary Cell --- (i , j)
                if(i == 1 || j == 1 || toRows == i || toCols == j) {
                    System.out.print("* ");
                } else  {
                    System.out.print("  ");
                }
            }

            System.out.println();

        }

    }

    public static void main(String[] args) {

        hollow_rectangle(5, 10);

    }


}
