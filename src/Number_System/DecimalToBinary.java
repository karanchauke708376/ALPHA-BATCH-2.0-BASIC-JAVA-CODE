package Number_System;

public class DecimalToBinary {

    public static void decitobin(int n) {


        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {

           int rem = n % 2;     // Remainder Nikalna
            binNum = binNum + rem * (int)(Math.pow(10, pow));

            pow++;
            n = n / 2;          // Quotient Nikalna
        }

        System.out.println("Binary From Of "+myNum+" =  "+binNum);
    }

    public static void main(String[] args) {

        decitobin(7);
    }
}

