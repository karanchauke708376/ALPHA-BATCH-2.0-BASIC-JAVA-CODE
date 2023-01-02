package Basic_Programs_Java;

public class HW_DataTypeResult {

    public static void main(String[] args) {

        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);

        // Same Calcualtion But Smallest Calculation

        double res = (f * b);
        double res1 = (i % c);
        double res2 = (d * s);

        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);

        double cal = res + res1 - res2;
        System.out.println(cal);






    }

}
