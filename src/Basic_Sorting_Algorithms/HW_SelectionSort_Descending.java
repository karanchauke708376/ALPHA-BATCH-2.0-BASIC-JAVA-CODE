package Basic_Sorting_Algorithms;

public class HW_SelectionSort_Descending {

    public static void print_SelectionSort(int Number[]) {

        for(int i = 0; i < Number.length-1; i++) {
            int MinPos = i;

            for(int j = i + 1; j < Number.length; j++) {
                if(Number[MinPos] < Number[j]) {
                    MinPos = j;
                }
            }
            // Swap
            int temp = Number[MinPos];
            Number[MinPos] = Number[i];
            Number[i] = temp;
        }

    }

    public static void printAfter_SelectionSort(int Number[]) {

        for (int i = 0; i < Number.length; i++) {
            System.out.print(Number[i]+" ");
        }
    }

    public static void main(String[] args) {

     //   int Number[]  = {5, 4, 1, 3, 2};

        int Number[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        print_SelectionSort(Number);

        printAfter_SelectionSort(Number);

    }

}
