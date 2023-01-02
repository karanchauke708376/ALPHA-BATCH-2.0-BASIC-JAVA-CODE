package Basic_Sorting_Algorithms;

public class Bubble_Sort_1 {

    public static void print_BubbleSort(int Number[]) {

        for(int turn = 0; turn < Number.length; turn++) {

            int swappingcheck = 0;

            for(int j = 0; j < Number.length-1-turn; j++) {

                if(Number[j] > Number[j + 1]) {

                    int temp = Number[j];
                    Number[j] = Number[j+1];
                    Number[j+1] = temp;
                    swappingcheck++;
                }

                System.out.println("Swapping Time Is : "+swappingcheck);
            }

        }

    }

    public static void printAfterBubbleSort(int Number[]) {

        for(int i = 0; i < Number.length; i++) {
            System.out.print(Number[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

     //   int Number[] = {45, 63, 14, 25, 78, 85, 6};

        //  int Number[] = {5, 4, 1, 3, 2};

            int Number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        print_BubbleSort(Number);
        printAfterBubbleSort(Number);


    }

}
