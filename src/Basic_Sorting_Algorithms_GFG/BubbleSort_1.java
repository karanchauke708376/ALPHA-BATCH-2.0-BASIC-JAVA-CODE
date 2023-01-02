package Basic_Sorting_Algorithms_GFG;

public class BubbleSort_1 {

    public static void print_BubbleSort(int Number[]) {

        for(int i = 0; i < Number.length-1; i++) {

            for(int j = 0; j < Number.length-1; j++) {

                if(Number[j] > Number[j + 1]) {

                    int temp = Number[j];
                    Number[j] = Number[j + 1];
                    Number[j+1] = temp;
                }
            }

        }

    }

    public static void printAfter_BubbleSort(int Number[]) {

        for(int i = 0; i < Number.length; i++) {

            System.out.print(Number[i]+" ");
        }

    }

    public static void main(String[] args) {

        int Number[] = {5, 1, 4, 2, 8};

        print_BubbleSort(Number);

        printAfter_BubbleSort(Number);



    }
}
