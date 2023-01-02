package Arrays;

public class Binary_Search {

    public static int binary_search(int number[], int key) {

        int start = 0;
        int end = number.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // Comparisons
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {    // Right  --------- >
                start = mid + 1;

            } else {            //  <---------  Left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {


        // Sorted Array Required  ----------->

        int number[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 11;

        /*
        // Sorted Array
        int number[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int key = 50;
        */

        System.out.println(key+" Key Is Find To Index In : "+ binary_search(number, key));

    }

}
