package Basic_Sorting_Algorithms;

import java.util.Arrays;

import java.util.Collections;
public class Inbuilt_Sort_2 {

    public static void printInbuilt_Arrays(int Number[]) {

        for(int i = 0; i < Number.length; i++) {

            System.out.print(Number[i]+" ");

        }

    }


    public static void main(String[] args) {

        int Number[] = {78, 54, 61, 36, 15, 25, 94, 18, 69, 31, 17};

        Arrays.sort(Number, 0, 11);

   /*     Integer Number[] = {78, 54, 61, 36, 15, 25, 94, 18, 69, 31, 17};

        Arrays.sort(Number, 0, 11, Collections.reverseOrder());    */

        printInbuilt_Arrays(Number);

    }

}
