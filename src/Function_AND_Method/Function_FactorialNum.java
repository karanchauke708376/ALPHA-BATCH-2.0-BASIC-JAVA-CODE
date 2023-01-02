package Function_AND_Method;


public class Function_FactorialNum {

    public static int fact(int n) {

        int f = 1;
        for(int i = 1; i <= n; i++) {

            f = f * i;
        }
        return f;
    }
    public static void main(String args[]) {

        int ans = fact(5);
        System.out.println("Factorial Is : "+ans);

    }
}
