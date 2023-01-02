package Arrays_Practice;

public class Kadanes_Algorithms {

    public static void printKadaneAlgo(int number[]) {

        int MaxSum = Integer.MIN_VALUE;
        int CurrentSum = 0;

        for(int i = 0; i < number.length; i++) {

            CurrentSum = CurrentSum + number[i];



            if(CurrentSum < 0) {
                CurrentSum = 0;
            }

            MaxSum = Math.max(CurrentSum , MaxSum);
        }

        System.out.println("Our Max Subarrays Sum Is : " +MaxSum);

    }




    public static void main(String[] args) {

      //  int number[] = {-2, -3, 4, -1, -2, 1, 5,-3};

        int number[] = {-1, -2, -3, -4 };

        printKadaneAlgo(number);

    }


}
