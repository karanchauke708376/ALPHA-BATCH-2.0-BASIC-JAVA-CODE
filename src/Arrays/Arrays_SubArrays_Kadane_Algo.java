package Arrays;

public class Arrays_SubArrays_Kadane_Algo {

    public static void printSubArraysKadane(int number[]) {

        int maxsum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0; i < number.length; i++) {

            currentSum = currentSum + number[i];

            if(currentSum < 0) {
                currentSum = 0;
            }

            maxsum = Math.max(currentSum, maxsum);
        }

        System.out.println("Kadane Algorithm SubArrays : " +maxsum);

    }


    public static void main(String[] args) {

      //  int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};
     //   int number[] = {-1, -2, -3, -4};
      //  int number[] = {-2, 5 , 6, -4, 8};
        int number[] = {2, 4, 6, 8, 10};



        printSubArraysKadane(number);



    }

}
