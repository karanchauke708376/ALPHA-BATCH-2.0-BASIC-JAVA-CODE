package Arrays_JavaTPoint;

public class Arrays_Smallest_Elements {

    public static int printSmallest(int Number[]) {

        int min = Number[0];

        for(int i = 1; i < Number.length; i++) {

            if(Number[i] < min) {

                min = Number[i];

            }

        }
        return min;

       // System.out.println("Smallest Elements Of Arrays Is : "+Smallest);

    }

    public static void main(String[] args) {

        int Number[] = {9, 8, 74844, 6, -5, 4, 3, 2, -484} ;

        printSmallest(Number);

        System.out.println("Smallest Elements Is : " + printSmallest(Number));

    }


}
