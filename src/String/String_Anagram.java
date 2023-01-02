package String;

import java.util.Arrays;

public class String_Anagram {

    public static void main(String[] args) {

        String str1 = "Bad credit";
        String str2 = "Debit card";

        //Convert Strings to lowercase. Why? so that we don't have to check
        // separately for lower & uppercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First check - if the lengths are the same
        if(str1.length() == str2.length()) {

        // convert strings into char array
            char[] chararray1 = str1.toCharArray();
            char[] chararray2 = str2.toCharArray();

            // sort the char array
            Arrays.sort(chararray1);
            Arrays.sort(chararray2);

            // if the sorted char arrays are sameor identical then the strings
            // areanagram
            boolean result = Arrays.equals(chararray1, chararray2);

            if(result) {
                System.out.println(str1+" and " +str2+" are anagram");
            } else {
                System.out.println(str1+" and " + str2+" are not angram");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram");
        }

    }
}