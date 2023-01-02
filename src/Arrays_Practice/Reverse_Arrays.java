package Arrays_Practice;

public class Reverse_Arrays {

    public static void print_ReverseArrays(int number[]) {

        int first = 0;
        int last = number.length-1;

        if(first < last) {

            // Swapping
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }

    }

    public static void main(String[] args) {

        int number[] = {47, 54, 64, 15, 87, 94, 0, 3, 64, 91, 57, 34};

       print_ReverseArrays(number);

       for(int i = 0; i < number.length; i++) {
           System.out.print((number[i]+" "));
       }


    }
}
