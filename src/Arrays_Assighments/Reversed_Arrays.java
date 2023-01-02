package Arrays_Assighments;

public class Reversed_Arrays {

    public static void print_ReversedArrays(int Number[]) {

        int Start = 0;
        int End = Number.length - 1;

        while (Start < End) {

            int temp = Number[Start];
            Number[Start] = Number[End];
            Number[End] = temp;

            Start++;
            End--;
        }
    }
    public static void main(String[] args) {

        int Number[] = {9 , 8, 7, 6, 5, 4, 3, 2, 1};


        print_ReversedArrays(Number);

        System.out.println("Reverse Arrays ");
        for(int i = 0; i < Number.length; i++) {
            System.out.print(Number[i]+" ");
        }


    }

}
