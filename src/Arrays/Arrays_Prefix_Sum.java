package Arrays;

public class Arrays_Prefix_Sum {

    public static void prefixarraysum(int number[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];  // New Array prefix

        prefix[0] = number[0];          // Calculation Initial Value Of Zero
        // Calculate Prefix Array
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + number[i];  // Previous Index Sum and Next Index
        }

        for(int i = 0; i < number.length; i++) {
            int start = i;          // Starting  Looop Start = i  index of zero
            for (int j = i; j < number.length; j++) {
                int end = j;        // Ending Looop End = j index of length-1

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {             // Max Value Check And Then Transfer currsum to maxsum
                    maxSum = currSum;
                }
            }
        }

        System.out.print("Max Sum Is : " + maxSum);       // Print maxsum

    }

    public static void main(String[] args) {

        int number[] = {1, -2, 6, -1, 3};

        prefixarraysum(number);


    }
}
