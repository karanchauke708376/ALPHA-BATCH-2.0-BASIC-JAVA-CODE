package Arrays_Practice;

public class Binary_Search {

    public static int printBinarySearch(int number[], int key) {

        int start = 0;
        int end = number.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if (number[mid] == key) {
               return mid;

            } else if (number[mid] < key) {
                start =  mid+1;

            } else {
                end = mid-1;
            }

        }

        return -1;
    }


    public static void main(String[] args) {

     /*
        int number[] = {4, 8, 12, 16, 20, 24, 28, 32, 36, 40};
        int key = 28;   */

        int number[] = {2, 4, 6, 8, 10, 12, 14};
        int key =  12;

        int result = printBinarySearch(number, key);

        if(result == -1) {
            System.out.println(key+" Elements Not Found Index Is : "+result);
        } else {
            System.out.println(key+" Elements Found Index Is : "+result);
        }

    }

}
