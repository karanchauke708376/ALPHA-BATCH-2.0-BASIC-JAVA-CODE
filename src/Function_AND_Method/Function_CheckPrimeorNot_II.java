package Function_AND_Method;

public class Function_CheckPrimeorNot_II {

    public static boolean primenum(int n) {

        if(n == 2) {
            return true;
        }

        for(int i = 2; i <=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Number Is Prime Or Not : ");
        System.out.println(primenum(6));

    }
}
