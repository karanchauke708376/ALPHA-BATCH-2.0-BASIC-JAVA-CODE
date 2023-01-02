package Arrays_Practice;

public class SubArrays_Max_Sum {


    public static void printSum_Max(int number[])  {

        int MaxSubArrays = Integer.MIN_VALUE;


        for(int i = 0; i <= number.length-1; i++) {
            int start = i;

            for(int j = i; j <= number.length-1; j++) {
                int end = j;

                int currsum = 0;
                for(int k = start; k <= end; k++) {

                    currsum += number[k];
                    System.out.print(number[k]+" ");
                }

                if(MaxSubArrays < currsum){
                    MaxSubArrays = currsum;
                }

                System.out.print(" "+currsum);
                System.out.println();
            }

            System.out.println();
        }

        System.out.println("Total Max Sub Arrays Is : "+MaxSubArrays);

    }

    public static void main(String[] args) {

        int number[] = {2, 4, 6, 8, 10};

        printSum_Max(number);

    }

}
