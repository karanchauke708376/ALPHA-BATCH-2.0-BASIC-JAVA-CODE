package Arrays_JavaTPoint;

public class Second_Largest_Elements_II {

    public static int printSecondLargest(int Number[]) {
        int FirstLargest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;


        for (int i = 0; i < Number.length; i++) {

            if(Number[i] > FirstLargest) {
                SecondLargest = FirstLargest;
                FirstLargest = Number[i];

            } else if(Number[i] > SecondLargest && SecondLargest != FirstLargest) {
                SecondLargest = Number[i];
            }

        }

        return SecondLargest;
    }


    public static void main(String[] args) {

        int Number[] = {78, 6, 24, 85, 10, 45, 31, 64, 98, 17};

     //   int Number[] = {45, 69, 14, 64, 87, 12};

        System.out.println("Second Largest Is "+printSecondLargest(Number));

    }

}
