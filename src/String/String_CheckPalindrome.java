package String;

public class String_CheckPalindrome {

    public static boolean print_Palindrome(String str) {

        int N = str.length();   // String Length

        for(int i = 0; i < str.length()/2; i++) {   // Half Loop

            if(str.charAt(i) != str.charAt(N-1-i)) {   // Half Loop Bcouse Last --

                System.out.println("Not Palindrome.");
                return false;
            }

        }
        System.out.println("Palindrome.");
        return true;

    }

    public static void main(String[] args) {

        String str= "RACECAR";

        String str1 = "Noon";

     //   print_Palindrome(str1);

        System.out.println(print_Palindrome(str1));

    }
}
