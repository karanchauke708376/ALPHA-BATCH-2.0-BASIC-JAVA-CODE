package Arrays_JavaTPoint;

public class Arrays_RemoveDuplicate_Sorted {

    public static void printRemoveElements(int Number[]) {

        int temp[] = new int[Number.length];
        int j = 0;

        for (int i = 0; i < Number.length - 1; i++) {     // Iteration

            if (Number[i] != Number[i + 1]) {             // Check Condition Is Not Equal

                temp[j] = Number[i];                      // Transfer i to j
                j++;                                      // j++ Increments

            }

        }
        temp[j] = Number[Number.length-1];              // Number[] Last Index Add To Temp j
        for(int i = 0; i <temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }


    public static void main(String[] args) {

        int Number[] = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8};

        printRemoveElements(Number);


    }

}
