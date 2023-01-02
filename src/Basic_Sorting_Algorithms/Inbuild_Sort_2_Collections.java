package Basic_Sorting_Algorithms;

import Arrays_Practice.Reverse_Arrays;

import java.util.Arrays;
import java.util.Collections;
public class Inbuild_Sort_2_Collections {
    // Object Type Variable

    public static void print_InbuiltSort(Integer Number[]) {

        for(int i = 0; i < Number.length; i++) {

            System.out.print(Number[i]+" ");
        }

    }

    public static void main(String[] args) {

     //   Integer Number[] = {5, 4, 1, 3, 2};

     //   Arrays.sort(Number, Collections.reverseOrder());

        /*  reverseOrder ----------->     The returned comparator is serializable.  */
        /* Reverse Order Print Elements Collection of objects that implement the Comparable interface */

        Integer Number[] = {48, 94, 61, 45, 12, 34, 28, 94, 57, 81, 74, 98, 66};

        Arrays.sort(Number,0, 13, Collections.reverseOrder());

                    /*  reverseOrder ----------->     The returned comparator is serializable.  */
                  /* Sorts the specified range of the specified array of objects according to the order induced by
                     the specified comparator. The range to be sorted extends from index fromIndex, inclusive, to index toIndex, exclusive.
                     (If fromIndex==toIndex, the range to be sorted is empty.)   */


        print_InbuiltSort(Number);






    }

}
