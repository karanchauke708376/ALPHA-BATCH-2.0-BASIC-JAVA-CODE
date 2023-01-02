package Function_AND_Method;

public class Function_RangeCheckPrimeorNot {

    public static boolean isprime(int n) {

        boolean isPrime =true;

        for(int i = 2; i <= n-1; i++){

            if(n % i == 0) {

                isPrime = false;
            }
        }
        return isPrime;

    }

    public static void primeInRange(int n) {

        for(int i = 2; i <= n; i++) {
            if(isprime(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        primeInRange(50);  // 2 to 20 Range

    }

}
