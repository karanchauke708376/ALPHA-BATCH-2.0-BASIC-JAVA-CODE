package Operators;

public class Assighment_Operators {

    public static void main(String[] args) {

        int a = 10;
     //     a = a + 10;  // 10 + 10 = 20   Slow Execution
            a += 10;      // Faster Execution
        System.out.println(" += "+a);

        int b = 15;
         //   b = b - 5;
            b -= 5;
        System.out.println(" -= "+b);

        int c = 20;
        //   c = c * 5;
        c *= 5;
        System.out.println(" *= "+c);

        int d = 25;
        //   d = b / 4;
        d /= 4;
        System.out.println(" /= "+d);

        int e = 15;
        //   e = e % 5;
        e %= 5;
        System.out.println(" %= "+e);

    }
}
