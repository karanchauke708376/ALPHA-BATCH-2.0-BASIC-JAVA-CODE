package Arrays_JavaTPoint;

public class Arrays_Reverse {

    public static void printReverseArrays(int Number[]) {

        int first = 0;
        int last = Number.length-1;

        while (first < last) {

            // Swap

            int temp = Number[last];
            Number[last] = Number[first];
            Number[first] = temp;


            first++;
            last--;
        }

    }
    public static void main(String[] args) {

      //  int Number[] = {88, 8, 7, 6, -5, 4, 3, 2, 95} ;

          int Number[] = {99, 74, 58, 14, 35, 12, 89};


       printReverseArrays(Number);

        for(int i = 0; i < Number.length; i++) {

            System.out.print(Number[i] + " ");
        }

    }

}
