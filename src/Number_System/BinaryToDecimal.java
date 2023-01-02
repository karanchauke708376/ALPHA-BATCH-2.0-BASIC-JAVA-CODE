package Number_System;

import javax.swing.*;

public class BinaryToDecimal {

    public static void BintoDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {

            int lastDigit = binNum % 10; // Remainder Return / Nikalna
            decNum = decNum + lastDigit * (int)Math.pow(2, pow);

            pow++;
            binNum = binNum / 10;   // Quotient Return / Nikalna
        }

        System.out.println("Binary Number Of "+myNum+" To Decimal Is :   "+decNum);
    }

    public static void main(String[] args) {

        BintoDec(1010101);

    }
}
