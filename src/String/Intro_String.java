package String;

import java.util.Scanner;

public class Intro_String {

    public static void print_StringLength(String str) {

        for(int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i) + " ");
        }

    }

    public static void main(String[] args) {

//        char arr[] = {'A', 'M', 'A', 'R'};
//
//        String str = "ABCDxyz";
//
//        String str1 = new String("Hi, Everyone");

        // String Are Immutable


   /*     Scanner sc =new Scanner(System.in);
        System.out.println("Enter Words : ");
   //   String Name = sc.next();  // Single  Word Print
        String Name = sc.nextLine(); // Sentence Print Line
        System.out.println(Name.length()+" ");  */

        // String Length

        String FName = "Karan Chauke";
        System.out.println(FName.length() + "Karan Chauke");

        // Concatenation +

        String FirstName = "AMAN";
        String LastName = "Dhattarwal";
        String FullName = FirstName + " " + LastName;
        System.out.println(FullName + " This Is Concatenation String ");
        System.out.println(FirstName.charAt(2));


        print_StringLength("Function Call : "+FullName);


    }

}
