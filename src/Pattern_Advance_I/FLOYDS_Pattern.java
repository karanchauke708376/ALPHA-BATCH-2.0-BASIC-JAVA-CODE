package Pattern_Advance_I;

public class FLOYDS_Pattern {

    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                int sum = i + j;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
