package Pattern_Advance_II;

public class Butterfly_Pattern {

    public static void butterflyprint(int n) {

        // ---------- 1st Half -------------
        for(int i = 1; i <= n; i++) {

            // Stars  -----> i
                for(int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

            // Space  -----> 2 * (n - i)
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // Stars  -----> i
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ------------ 2nd Half ----------
        for(int i = n ; i >= 1; i--) {
            // Stars  -----> i
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Space  -----> 2 * (n - i)
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // Stars  -----> i
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {

        butterflyprint(5);

    }

}
