package Function_AND_Method;

public class Function_OverloadingCalculate {

    public  static int calculate(int a , int b){

        return a + b;
    }
    public static int calculate(int a, int b, int c ) {
        return a * b * c;
    }

    public static void main(String args[]) {

        int ans = calculate(4 , 5);

        int ans1 = calculate(7, 3, 4);

        System.out.println("Calculate A + B : "+ans);

        System.out.println("Calcualte A * B * C : " +ans1);
    }

}
