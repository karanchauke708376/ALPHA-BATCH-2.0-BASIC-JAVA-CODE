package Arrays_Practice;

public class SubArrays {

    public static void print_Subarrays(int number[]) {

        for(int i = 0; i <= number.length-1; i++) {
            int start = i;

            for(int j = i; j <= number.length-1; j++) {
                int end = j;
                int current = 0;

                for(int k = start; k <= end; k++) {
                    current += number[k];

                    System.out.print(number[k]+" ");
                }
                System.out.print(" "+current);
                System.out.println();

            }

            System.out.println();

        }

    }

    public static void main(String[] args) {

        int number[] = {2, 4, 6, 8, 10};

       print_Subarrays(number);

    }

}
