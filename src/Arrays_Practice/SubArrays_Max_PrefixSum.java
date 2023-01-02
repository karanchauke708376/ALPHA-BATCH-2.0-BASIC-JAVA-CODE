package Arrays_Practice;

public class SubArrays_Max_PrefixSum {

    public static void printSubArraySumMax(int number[] ) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];

        // Calculate prefix Array
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + number[i];
            /*pehle wale /previous element sum + current element sum  */
        }

        for(int i = 0; i < number.length; i++) {
            int start = i;

            for(int j = i; j < number.length; j++) {
                int end = j;

                // Replace To Loops
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum  < currSum) {
                    maxSum = currSum;
                }

            }
        }

        System.out.println("Max Sum Is : " +maxSum);

    }


    public static void main(String[] args) {

      int number[] = {1, -2, 6, -1, 3};
      printSubArraySumMax(number);


    }

}