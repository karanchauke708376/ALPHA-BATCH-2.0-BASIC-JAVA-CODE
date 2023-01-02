package Arrays_JavaTPoint;

public class Arrays_RightRotate {

    public static void main(String[] args) {

        int number[] = {1, 2, 3, 4, 5, 6, 7};
        int n = 4;
        System.out.println("Original Arrays : ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            int j, last;

            last = number[number.length - 1];

            for (j = number.length - 1; j > 0; j--) {

                number[j] = number[j - 1];
            }
            number[0] = last;
        }
        System.out.println();

        System.out.println("Array After The Right Rotation : ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
