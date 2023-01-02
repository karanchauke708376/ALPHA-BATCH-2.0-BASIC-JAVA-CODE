package Loops;

public class Nested_Loops_Half_Pyramid_Num {

    public static void main(String[] args) {

        int n = 4;

        for(int line = 1; line <= n; line++) {

            for(int count = 1; count <=line; count++) {

                System.out.print(count+" ");
            }
            System.out.println();
        }
    }

}
