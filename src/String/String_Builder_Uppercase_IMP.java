package String;


public class String_Builder_Uppercase_IMP {

    public static String print_toUppercase(String str) {

        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++) {

            if(str.charAt(i) == ' ' && i < str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else  {
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();    // String Convert
    }

    public static void main(String[] args) {

            String str = "hi i am shradha";
       //   String str = "ofdo mofdovop omofd omod ds dg f sff ss sf be sw onf mcn n d c as aj ";
        System.out.println(print_toUppercase(str));
    }

}
