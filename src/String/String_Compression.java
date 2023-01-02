package String;

public class String_Compression {

    public static String print_StringCompression(String str) {

        String newStr = "";

        for(int i = 0; i < str.length(); i++) {  // Traverse String
            Integer Count = 1;  // Everyletter count 1 se start
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) { // condition true -- aaabbbccc
                Count++;   // letter same count Increase
                i++;       // index increase
            }
            newStr += str.charAt(i);    // Letter add new String
            if(Count > 1) {            // condition true greater 1 letter same
                newStr += Count.toString();   // new string add count value
            }
        }

        return newStr;
    }


    public static void main(String[] args) {

          String str = "aaaabbccdd";
  //      String str = "abcd";

        System.out.println(print_StringCompression(str));

    }

}
