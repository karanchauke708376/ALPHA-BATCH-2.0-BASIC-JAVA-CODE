package Basic_Sorting_Algorithms;

public class HW_CountingSort_Descending {

    public static void printCountingSort(int Number[]) {

        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < Number.length; i++){
            largest = Math.max(largest, Number[i]);
        }

        int count[] = new int[largest+1];
        for(int i = 0; i < Number.length; i++) {
            count[Number[i]]++;
        }

        int j = 0;
        for(int i = count.length-1; i >=0; i--) {

            while (count[i] > 0) {
                Number[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printAfterCountingSort(int Number[]) {

        for(int i = 0; i < Number.length; i++) {

            System.out.print(Number[i]+" ");
        }

    }

    public static void main(String[] args) {

        int Number[] = {1, 4, 1, 3, 2, 4, 3, 7};

        printCountingSort(Number);

        printAfterCountingSort(Number);

    }


}
