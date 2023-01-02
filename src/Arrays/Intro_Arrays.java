package Arrays;

import java.util.Scanner;

public class Intro_Arrays {

    public static void main(String[] args) {

        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Students 4 Subjects Marks : ");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();

        System.out.println("Phy : "+marks[0]);
        System.out.println("Chem : "+marks[1]);
        System.out.println("Math : "+marks[2]);
        System.out.println("Bio : " + marks[3]);

/*
        marks[4] = 95;     // Values Values
        System.out.println("Bio : " + marks[4]);

        marks[3] = marks[2] + 5 ;   // Update Values
        System.out.println("Math : " +marks[3]);
*/

        int percentage = (marks[0] + marks[1] + marks[2]) + marks[3] / 4;
        System.out.println("Percentage Is :  "+percentage+" % ");
        System.out.println("Length Of Array Marks : "+marks.length);



    }

}
