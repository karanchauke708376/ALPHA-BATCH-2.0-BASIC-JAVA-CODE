package Basic_Sorting_Algorithms;

public class HW_BubbleSort_Descending {


    public static void print_BubbleSort(int Number[] ) {

        for(int turn = 0; turn < Number.length; turn++) {

            for(int j = 0; j < Number.length-1-turn; j++) {

                if(Number[j] < Number[j+1]) {

                    int temp = Number[j];
                    Number[j] = Number[j+1];
                    Number[j+1] = temp;

                }
            }
        }
    }

    public static void printAfterBubbleSort(int Number[]) {

        for(int i = 0; i < Number.length; i++) {

            System.out.print(Number[i]+" ");
        }

    }

    public static void main(String[] args) {

    //    int Number[] = {5, 4, 1, 3, 2};

        int Number[] = {3, 6, 2, 1, 8, 7, 4 , 5, 3, 1};

        print_BubbleSort(Number);

        printAfterBubbleSort(Number);

    }

}
