package Arrays_Practice;

public class Arrays_Pairs {

    public static void printpairs(int number[]) {

        for(int i = 0; i <= number.length-1; i++) {       // Index ---- > 0 to n --- > arrays 2 to 10
            int currentnum = number[i];
            for(int j = i+1; j <= number.length-1; j++) {

                System.out.print("("+ currentnum + ","+ number[j]+ ") ");

            }

            System.out.println();

        }


    }
    public static void main(String[] args) {

        int number[] = {2, 4, 6, 8, 10};

        printpairs(number);

    }
}
