package String;

public class String_SubString_Fn {

    public static String print_Substring(String str, int StartIndex , int EndIndex ) {

        String Substr = "";

        for(int i  = StartIndex; i < EndIndex; i++) {

            Substr += str.charAt(i);
        }

        return Substr;
    }

    public static void main(String[] args) {

        // Substring
        String str = "Hello World";
        System.out.println(print_Substring(str, 0, 5));

        // Default String SubString Function
        System.out.println(str.substring(0, 8));

    }

}
