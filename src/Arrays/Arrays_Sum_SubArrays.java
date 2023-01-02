package Arrays;

public class Arrays_Sum_SubArrays {

    public static void SumSubarrays(int number[]) {

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {    // Start
            int start = i;
            for (int j = i; j < number.length; j++) {   // End
                int end = j;
                int currsum = 0;
                for (int k = start; k <= end; k++) { // Print
                    currsum += number[k];
                    System.out.print(number[k] + " ");  // Subarrays
                }

                if(maxSum < currsum) {
                    maxSum = currsum;
                }
                System.out.print(" --- > " + currsum);

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum Sum Sub Arrays  : " + maxSum);
    }

    public static void main(String[] args) {

        int number[] = {2, 4, 6, 8, 10};
       // int number[] = {1, -2, 6, -1, 3};

        SumSubarrays(number);
    }
}
