package Function_AND_Method;

public class Function_CallByValue {

    public  static void swap(int a, int b) {
        // Swap

        int temp = 0;
        temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args) {
        // Swap --- Exchange Values

        int a = 5;
        int b = 10;

        swap(a , b);   // Call By Values Means Original To Copy Values
        System.out.println("Original Values : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}
