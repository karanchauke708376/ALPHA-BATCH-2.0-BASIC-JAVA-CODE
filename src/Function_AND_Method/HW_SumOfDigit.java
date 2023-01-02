package Function_AND_Method;

public class HW_SumOfDigit {

    public static int sumOfDigit(int n) {

        int sum = 0;
        int lastDigit = 0;

        while (n > 0) {

            lastDigit = n % 10;

            sum = sum + lastDigit;

            n /= 10;

        }
            return sum;

           // System.out.println("Sum Of Numbers : " + sum);

    }

    public static void main(String[] args) {

        System.out.println("SUm Of Digit : "+sumOfDigit(123456789));


    }
}
