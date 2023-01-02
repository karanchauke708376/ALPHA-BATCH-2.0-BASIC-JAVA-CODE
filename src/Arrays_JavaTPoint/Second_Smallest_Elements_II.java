package Arrays_JavaTPoint;

public class Second_Smallest_Elements_II {

    public static int printSmallestElements(int Number[]) {

        int FirstSmallest = Integer.MAX_VALUE;
        int SecondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < Number.length; i++) {

            if (Number[i] < FirstSmallest) {
                SecondSmallest = FirstSmallest;
                FirstSmallest = Number[i];

            } else if (Number[i] < SecondSmallest && SecondSmallest != FirstSmallest) {
                SecondSmallest = Number[i];
            }

            }
        return SecondSmallest;

        }

    public static void main(String[] args) {


        int Number[] = {78, 20, 51, 56, 15, 36, 40, 7};

      //  int Number[] = {45, 61, 3, 7, 94, 1};

     //   int Number[] = {45,88,36,68,4,55,66};


        System.out.println("Second Smallest Of Array Is : " +printSmallestElements(Number));

    }

}
