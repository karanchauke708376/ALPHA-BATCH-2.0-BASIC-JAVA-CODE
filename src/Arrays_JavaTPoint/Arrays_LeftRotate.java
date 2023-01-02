package Arrays_JavaTPoint;

public class Arrays_LeftRotate {

    public static void main(String[] args) {

    //    int number[] = {1, 2, 3, 4, 5} ;
          int number[] = {1, 2, 3, 4, 5, 6, 7};
        int n = 2;
        System.out.println("Original Arrays :");
        for(int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

        for(int i = 0; i < n; i++) {   // Rotate The Given Arrays By n time left
            int j;
            int first = number[0];  // Store The First Element Of Array

            for (j = 0; j < number.length - 1; j++) {


                number[j] = number[j + 1];   // Shift Elements Of Array By One
            }

            number[j] = first;   // First Elements of Array Will be Added
        }

        System.out.println();

        System.out.println("Arrays After Left Rotation :  ");
        for(int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }

    }

}
