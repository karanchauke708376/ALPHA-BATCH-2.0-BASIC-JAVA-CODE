package Arrays__2D;

import java.util.Scanner;


public class Intro_2D_Arrays_MaximumElements {

    final static int N = 3;
    final  static  int M = 3;
    public static int print_MaximumElement(int Matrix[][]) {

        int MaxElement = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++) {

            for(int j = 0; j < M; j++) {

                if(Matrix[i][j] > MaxElement){

                    MaxElement = Matrix[i][j];
                }

            }

        }

        return MaxElement;

    }
      public static void main(String[] args) {

          int Matrix [][] = {
                  {14, 6, 71},
                  {99, 71, 6},
                  {45, 87, 69}
          };

          for(int i = 0; i < N; i++) {
              for(int j = 0; j < M; j++) {

                  System.out.print(Matrix[i][j]+" ");
              }
              System.out.println();
          }

          System.out.println("Maximum Elements Arrays Is : " + print_MaximumElement(Matrix));

      }
}
