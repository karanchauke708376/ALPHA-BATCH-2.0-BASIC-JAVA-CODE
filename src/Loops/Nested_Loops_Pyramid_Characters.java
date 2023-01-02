package Loops;

public class Nested_Loops_Pyramid_Characters {

    public static void main(String[] args) {

        int n = 1500; // n = 4 ;
        char ch = 'A';  // Library Store Character

        for(int line = 1; line <= n; line++) {

            for( char chars = 1; chars <= line; chars++)  {

                System.out.print(ch+" ");
                ch++;  // Increment Character
            }
            System.out.println();
        }

    }
}
