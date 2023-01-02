package Arrays_JavaTPoint;

public class Even_Arrays {

    public static void printEvenArrays(int Number[]) {

     //   for(int i = 1; i < Number.length; i = i+2) {

            for (int i = 0; i < Number.length; i++) {

                if (Number[i] % 2 == 0) {

                    System.out.print(Number[i] + " ");
                }

            }

        }
    public static void main(String[] args) {

        int Number[] = {9, 8, 7, 6, 5, 4, 3, 2, 1} ;

        printEvenArrays(Number);

      //System.out.println("Even Number Of Arrays : "+printEvenArrays(Number));

    }

}
