package Arrays_Practice;

public class Linear_Search {

    public static int printLinearSearch(int number[] , int key) {

      //  int num = number.length;

        for(int i = 0; i <= number.length; i++) {

            if(number[i] == key) {
                return i;
            }
          //    return -1;
        }

        return -1;

    }

    public static void main(String[] args) {

        int number[] = {7 , 5, 6, 1, 9, 4, 3, 5, 48, 61, 9, 51, 67, 81, 69 , 0} ;
        int key = 81;

        int result = printLinearSearch(number, key);

        if(result == -1) {
            System.out.println("Elements Is Not Found ");
        } else {
            System.out.println("Elements Is Found " + result);
        }

    }
}
