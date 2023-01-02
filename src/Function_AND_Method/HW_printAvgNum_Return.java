package Function_AND_Method;

public class HW_printAvgNum_Return {

    public static int print3NumAvg(int a , int b, int c) {

        int sum = a + b + c;

        int avg = sum / 3;

        return avg;

    }

    public static void main(String[] args) {

        System.out.println("Average Of 3 Numbers : "+print3NumAvg(50, 12, 13));

    }

}
