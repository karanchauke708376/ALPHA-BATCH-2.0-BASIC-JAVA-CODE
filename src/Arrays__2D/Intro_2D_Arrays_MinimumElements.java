package Arrays__2D;

public class Intro_2D_Arrays_MinimumElements {

   static int N = 3;
    static int M = 3;

    public static int print_MinimumElements(int Matrix[][]) {

        int MinElement = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++) {

            for(int j = 0; j < M; j++) {

                if(Matrix[i][j] < MinElement) {
                    MinElement = Matrix[i][j];
                }

            }
        }
        return MinElement;

    }

    public static void main(String[] args) {

        int Matrix [][] = {
                {78, 69, 14},
                {31, 18, 64},
                {7, 56, 27}
              };

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {

                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Minimum Elements Arrays Is : "+print_MinimumElements(Matrix));

    }

}
