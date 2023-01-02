package Basic_Sorting_Algorithms;

public class Counting_Sort {

    public static void printCountingSort(int Number[]) {

        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < Number.length; i++) {
            largest = Math.max(largest, Number[i]);
        }

        int Count[] = new int[largest+1];
        for(int i = 0; i < Number.length; i++) {
            Count[Number[i]]++;

        }

        // Sorting
        int j = 0;
        for(int i = 0; i < Count.length; i++) {
            while (Count[i] > 0)  {
                Number[j] = i;
                j++;
                Count[i]--;
            }
        }

    }

    public static void printAfterCountingSort(int Number[]) {

        for(int i = 0; i < Number.length; i++) {
            System.out.print(Number[i]+" ");
        }
    }

    public static void main(String[] args) {

     //   int Number[] = {5, 4, 1, 3, 2};

        int Number[] = {1, 4, 1, 3, 2, 4, 3, 7};

        printCountingSort(Number);

        printAfterCountingSort(Number);


    }

}
