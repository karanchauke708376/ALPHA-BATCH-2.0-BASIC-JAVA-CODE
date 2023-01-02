package Arrays;

public class Arrays_SubArrays {

    public static void printSubarrays(int number[]) {


        int totalsubarray = 0;
        for(int i = 0; i < number.length; i++) {    // Start
            int start = i;
            for(int j = i; j < number.length; j++) {   // End
                int end = j;
                for(int k = start; k <= end; k++) { // Print
                    System.out.print(number[k]+" ");  // Subarrays
                }
                totalsubarray++;


                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays : "+totalsubarray);
    }

    public static void main(String[] args) {

        int number[] = {2, 4, 6, 8, 10};

        printSubarrays(number);
    }

}
