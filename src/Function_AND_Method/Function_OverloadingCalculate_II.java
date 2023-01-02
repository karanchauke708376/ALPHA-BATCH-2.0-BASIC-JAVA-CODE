package Function_AND_Method;

public class Function_OverloadingCalculate_II {

    public static int Calculate(int a, int b) {

        return a * b;

    }

    public static float Calculate(float a , float b) {

        return a + b;
    }

    public static void main(String[] args) {

        int int_ans = Calculate(5, 15);
        float floaat_ans = Calculate(14.2f, 6.10f);

        System.out.println("Integer A * B : "+int_ans);
        System.out.println("Float A + B : " +floaat_ans);



    }
}
