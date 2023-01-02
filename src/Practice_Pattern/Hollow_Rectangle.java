package Practice_Pattern;

public class Hollow_Rectangle {

    public static void printHollow_Rect(int rows, int cols) {

        for(int i = 1; i <= rows; i++ ){

            for(int j = 1; j <= cols; j++) {

                if(i == 1  || j == 1 || rows == i || cols == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        printHollow_Rect(8, 88);


    }
}
