package Arrays;
import java.util.*;
public class Arrays_LargestSmallest {

    public static int getLargest(int number[]) {

        int largest = Integer.MIN_VALUE; // - Infinity
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < number.length; i++) {

            if( largest < number[i]) {
                largest = number[i];

            }
            if(smallest > number[i]) {
                smallest = number[i];
            }
        }

        System.out.println("Smallest Number Is : "+smallest);
            return largest;
    }

    public static void main(String[] args) {

        int number[] = {4, 6, 8, 9, 11, 34, 84, 16, 19};

        System.out.println("Largest Value Is : "+getLargest(number));

    }

}
