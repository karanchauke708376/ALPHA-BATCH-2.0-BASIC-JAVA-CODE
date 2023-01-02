package String;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HW_1_LowercaseVowels {

    public static void main(String[] args) {

        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence : ");
        String alpha = sc.nextLine();

        for (int i = 0; i < alpha.length(); i++) {
            char ch = alpha.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println(alpha+" ");
        System.out.println("Total Count Vowels : "+count+" ");
    }



}
