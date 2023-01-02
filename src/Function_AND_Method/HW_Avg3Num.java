package Function_AND_Method;

public class HW_Avg3Num {

    public static void printAvgNum(int a , int b, int c) {

        int sum = a + b + c;

        int avg = sum / 3;

        System.out.println("Sum Of 3 Digit Is : "+sum);

        System.out.println("Average Of 3 Digit Is : "+avg);

    }

    public static void main(String[] args) {

        printAvgNum(75 , 12, 13);


    }

}
