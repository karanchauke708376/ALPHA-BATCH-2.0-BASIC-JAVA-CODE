package Basic_Sorting_Algorithms;

public class Selection_Sort {

    public static void print_SelectionSort(int Number[]) {

        for(int i = 0; i < Number.length-1; i++) {

            int MinPos = i;
            for(int j = i+1; j < Number.length; j++) {


                if(Number[MinPos] > Number[j]) {
                    MinPos = j;
                }
            }

            // Swapping
            int temp = Number[MinPos];
            Number[MinPos] = Number[i];
            Number[i] = temp;
        }

    }

    public static void printAfterSelectionSort(int Number[]) {

        for(int i = 0; i < Number.length; i++) {

            System.out.print(Number[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int Number[] = {5, 4, 1, 3, 2};

        print_SelectionSort(Number);

        printAfterSelectionSort(Number);
    }

}
