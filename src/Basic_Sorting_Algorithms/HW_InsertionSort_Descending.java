package Basic_Sorting_Algorithms;

public class HW_InsertionSort_Descending {

    public static void print_SelectionSort(int Number[]) {


        for(int i = 1; i < Number.length; i++) {

            int current = Number[i];
            int prev = i - 1;

            //
            while (prev >= 0 && Number[prev] < current) {
                Number[prev+1] = Number[prev];
                prev--;
            }
            // Insertion
            Number[prev+1] = current;
        }
    }
    public static void printAfter_SelectionSort(int Number[]) {

        for(int i = 0; i < Number.length; i++) {

            System.out.print(Number[i]+" ");
        }

    }
    public static void main(String[] args) {

    //    int Number[] = {5, 4, 1, 3, 2};

        int Number[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        print_SelectionSort(Number);
        printAfter_SelectionSort(Number);

    }
}
