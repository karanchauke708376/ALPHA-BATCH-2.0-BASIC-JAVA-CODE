package Function_AND_Method;

public class Function_CheckPrimeorNot {

    public static boolean isPrime(int n) {

        // Corner Cases
        // only for >= 2

        if(n == 2) {
            return true;
        }


      //  boolean isPrime = true;
        for(int i = 2; i <= n-1; i++) {

            if( n % i == 0) {  // Completely Dividing
             //   isPrime = false;
               // return isPrime;
                return false;
              //  break;

            }
        }

       // return isPrime(n);
        return true;

    }

    public static void main(String[] args) {

        System.out.println("Number Is Prime Or Not : ");
        System.out.println(isPrime(7));

    }

}
