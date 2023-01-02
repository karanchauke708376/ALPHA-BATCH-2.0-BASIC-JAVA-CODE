package Basic_Sorting_Algorithms;

import java.util.Arrays;

// Primitive Type / Basic
public class Inbuilt_Sort_1 {

    public static void printInbuilt_Sort(int Number[]) {


        for(int i = 0; i < Number.length; i++) {

            System.out.print(Number[i]+" ");

        }

    }


    public static void main(String[] args) {

  //      int Number[] = {5, 4, 1, 3, 2};

   //     Arrays.sort(Number);

        /* Sorts the specified array into ascending numerical order using Inbuilt function    */

        int Number[] = {48, 94, 61, 45, 12, 34, 28, 94, 57, 81, 74, 98, 66};

        Arrays.sort(Number, 0, 13);
        /* Sorts the specified range of the array into ascending order.
        // The range to be sorted extends from the index fromIndex, inclusive, to the index toIndex, exclusive.
        // If fromIndex == toIndex, the range to be sorted is empty.  */

        printInbuilt_Sort(Number);


    }
}
