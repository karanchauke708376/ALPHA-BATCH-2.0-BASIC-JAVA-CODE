package Arrays_JavaTPoint;

public class Arrays_Largest_Elements {


    public static int printLargest(int Number[]) {


        int largest = Number[0];

        for(int i = 1; i < Number.length; i++) {


            if(Number[i] > largest) {

                largest = Number[i];
            }

        }

        return largest;

    }

    public static void main(String[] args) {

        int Number[] = {9, 85, 7, 6, -3535, 44, 943, 2, 1} ;

        //printLargest(Number);
        System.out.println("Largest Elements Is : "+printLargest(Number));



    }
}
