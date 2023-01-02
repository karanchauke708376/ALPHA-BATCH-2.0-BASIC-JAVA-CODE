package Arrays_JavaTPoint;

public class Arrays_RemoveDuplicate_Sorted_Print {

    public static void printRemoveDuplicate(int Number[]) {

        int j = 0;
        for(int i = 0; i < Number.length-1; i++) {

            if(Number[i] != Number[i + 1]) {

                Number[j] = Number[i];
                j++;
            }
        }

        Number[j] = Number[Number.length-1];
        for(int i = 0; i < j+1; i++) {
            System.out.print(Number[i]+" ");
        }

    }



    public static void main(String[] args) {

        int Number[] = {1, 2, 2, 3, 4, 5, 5, 6, 6, 7};

        printRemoveDuplicate(Number);

    }
}
