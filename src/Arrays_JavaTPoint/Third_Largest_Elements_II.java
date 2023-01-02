package Arrays_JavaTPoint;

public class Third_Largest_Elements_II {

    public static int printThirdLargest(int Number[]) {

        int Firstlargest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        int ThirdLargest = Integer.MIN_VALUE;

        for (int i = 0; i < Number.length; i++) {

            if (Number[i] > Firstlargest) {
                SecondLargest = Firstlargest;
                Firstlargest = Number[i];

            } else if (Number[i] > SecondLargest) {
                ThirdLargest = SecondLargest;
                SecondLargest = Number[i];


            } else if (Number[i] > ThirdLargest) {
                ThirdLargest = Number[i];

            }
        }

         return ThirdLargest;
    }



    public static void main(String[] args) {

        int Number[] = {45, 9, 21, 75, 80, 91, 19, 100};

       // int Number[] = {15, 36, 98, 85, 51, 7, 61, 34, 19, 72};

        System.out.println("Third Largest Is : " + printThirdLargest(Number));


    }

}
