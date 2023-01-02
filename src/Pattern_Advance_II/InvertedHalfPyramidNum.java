package Pattern_Advance_II;
public class InvertedHalfPyramidNum {

    public static void InvHalPyrNum(int n) {

        // Outer Loop for line
        for (int i = 1; i <= n; i++) {
                // Inner Loop for 1 to 5
            for (int j = 1;  j<= n-i+1; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        InvHalPyrNum(5);

    }
}