package Arrays_JavaTPoint;

public class Addition_Of_Arrays {

    public static int printSumArrays(int number[]) {

        int sum = 0;
        for(int i = 0; i < number.length; i++) {

            sum +=number[i];
        }

        return sum;

    }


    public static void main(String[] args) {

        int number[] = {9, 8, 7, 6, 5, 4, 3, 2, 1 };

         //   printSumArrays(number);

        System.out.println("Sum Of Arrays Is : "+printSumArrays(number));



    }

}
