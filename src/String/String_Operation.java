package String;

public class String_Operation {

    public static void main(String[] args) {

        String s1 = "Tony";
        String s2 = "Tony";

        String s3 = new String("Tony");    // Object Level Equal Check


        if (s1 == s2) {
            System.out.println("String Are Equal");
        } else {
            System.out.println("String Are Not Equal");
        }

        if (s1 == s3) {
            System.out.println("STRING ARE EQUAL");
        } else {
            System.out.println("STRING ARE NOT EQUal");
        }
        if (s1.equals(s3)) {
            System.out.println("String ARE Equal");
        } else {
            System.out.println("String ARE Not Equal ");
        }
    }
}
