package Arrays;

public class Reversed_Arrays {

    public static void reversearray(int number[]) {

        int first = 0;
        int last = number.length-1;

        while(first < last) {

            // Swap
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;        // index ++
            last--;      // index --;
        }

    }
    public static void main(String[] args) {

       // int number[] = {2, 4, 6, 8,10};
        int number[] = {0, 1, 2, 4, 5, 6, 7};

        reversearray(number);
        for(int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

    }
}
