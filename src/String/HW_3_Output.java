package String;

public class HW_3_Output {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("ApnaCollege");

        System.out.println(str);
        StringBuilder strreturn = str.replace(3,11,"i Kaksha");
        System.out.println("After StringBuilder Way Replace : "+strreturn);

        String str1 = "APNACOLLEGE";

        System.out.println(str1);
        System.out.println("After String Replace : "+str1.replace('A', 'a'));
    }
}
