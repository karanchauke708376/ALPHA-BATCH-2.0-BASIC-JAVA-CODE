package Pattern_Advance_II;

public class FLODS_Triangle {

    public static void flodstriangle(int n) {

        int countter = 1;

        // Outer Loop For Line
        for(int i = 1; i <= n; i++) {
                // Inner Looop For Counter add
            for(int j = 1; j <= i; j++) {

                System.out.print(countter+" ");
                countter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        flodstriangle(5);

    }
}
