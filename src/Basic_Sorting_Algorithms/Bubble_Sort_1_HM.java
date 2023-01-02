package Basic_Sorting_Algorithms;


// Time Complexity Try ------ >  O(n)
public class Bubble_Sort_1_HM {

    public static void printBubbleSort(int Number[]) {

        for(int i = 0; i < Number.length-1; i++) {

            int swappingcheck = 0;

       //     for (int j = 0; j < Number.length-1-i; j++) {

                if(Number[i] > Number[i + 1]) {

                    int temp = Number[i];
                    Number[i] = Number[i + 1];
                    Number[i + 1] = temp;
                    swappingcheck++;
                }
                Number[i]++;
                System.out.println("Swapping Check Run Time Is :  "+swappingcheck);

            }


        }


    //}

    public static void printAfterBubbleSort(int Nummber[]) {

        for(int i = 0; i < Nummber.length; i++) {
            System.out.print(Nummber[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int Number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        printBubbleSort(Number);

        printAfterBubbleSort(Number);

    }


}
