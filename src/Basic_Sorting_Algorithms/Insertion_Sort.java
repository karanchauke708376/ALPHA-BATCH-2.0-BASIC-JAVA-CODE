package Basic_Sorting_Algorithms;

public class Insertion_Sort {

    public static void printInsertionSort(int Number[]) {

        for(int i = 1; i < Number.length; i++) {

            int curr = Number[i];               // curr = 4
            int prev = i - 1;     // prev =  5  ,

            // Finding Out The Corrct Position To Insert
            while (prev >= 0 && Number[prev] > curr) {
                Number[prev+1] = Number[prev];
                prev--;   // blak index
            }
            // Insertion
            Number[prev+1] = curr;
        }
    }

    public static void printAfterInsertionSort(int Number[]) {

        for(int i = 0; i < Number.length; i++) {

            System.out.print(Number[i]+" ");

        }
    }

    public static void main(String[] args) {

        int Number[] = {5, 4, 1, 3, 2};

        printInsertionSort(Number);

        printAfterInsertionSort(Number);

    }

}
