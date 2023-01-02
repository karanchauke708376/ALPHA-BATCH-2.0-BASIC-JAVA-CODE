package Practice_Pattern;

public class FLOYDS_Triangle {

    public static void printFlods(int n) {

        int counter = 0;
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <=i; j++) {
                counter++;
                System.out.print(counter+" ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {


        printFlods(5);

    }

}
