package Arrays_JavaTPoint;

public class Arrays_Copy {

    public static void main(String[] args) {

        int number1[] = {9, 8, 77, 66, 5, 44, 3, 5, 8, 0};

        int number2[] = new int[number1.length] ;

        for(int i = 0; i < number1.length; i++) {

            number2[i] = number1[i];

        }

        System.out.println("Original Arrays Is : ");
        for(int i = 0; i < number1.length; i++) {
            System.out.print(number1[i]+" ");
        }
        System.out.println();

        System.out.println("Copy Arrays Is : ");
        for(int i = 0; i < number2.length; i++) {
            System.out.print(number2[i]+" ");
        }

    }


}
