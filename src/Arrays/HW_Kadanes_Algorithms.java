package Arrays;

public class HW_Kadanes_Algorithms {

    public static int kedanes(int number[]) {


        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int temp = 0;
        int smallest = 0;
        int second = 0;

        for(int i = 0; i < number.length; i++){

            currentSum = currentSum + number[i];

            if(currentSum < 0) {
                currentSum = 0;
            } else if(number[i] == currentSum) {
                temp = currentSum;
                smallest = second;
            }

            maxSum = Math.max(currentSum, maxSum);
        }

        System.out.println("Kedanes Algorithm Of SubArrays : " + maxSum);
        return maxSum;
    }

    public static void main(String[] args) {

         int number[] = {-4, -6, -8, -6, -3, -7, -1};

      //  int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        kedanes(number);


    }

}
