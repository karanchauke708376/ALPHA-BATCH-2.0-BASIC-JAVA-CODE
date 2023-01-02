package Operators;

public class Arithmetic_Operators {

    public static void main(String[] args) {

        int a = 10 ;
        int b = 5;

        int sum = a + b;
        int mul = a * b;
        int sub = a - b;
        int div = a / b;
        int mod = a % b;

        System.out.println("Sum Of A and B : " +sum);
        System.out.println("Multiplication Of A and B : " +mul);
        System.out.println("Subtraction  Of A and B : " +sub);
        System.out.println("Division  Of A and B : " +div);
        System.out.println("Module Of A and B : " +mod);

        System.out.println("------------------------------------------");

        System.out.println("------------- Pre / Post Increments ---------------");
        int a1 = 10;
        int b1 = ++a1;

        System.out.println("Pre  Increments a1 : "+a1);
        System.out.println("Pre Increments b1 : "+b1);

        int a2 = 10;
        int b2 = a2++;

        System.out.println("Post  Increments a2 : "+a2);
        System.out.println("Post Increments b2 : "+b2);

        System.out.println("------------------------------------------");

        System.out.println("------------- Pre / Post Decrement ---------------");

        int a3 = 10;
        int b3 = --a3;

        System.out.println("Pre  Increments a1 : "+a3);
        System.out.println("Pre Increments b1 : "+b3);

        int a4 = 10;
        int b4 = a4--;

        System.out.println("Post  Increments a2 : "+a4);
        System.out.println("Post Increments b2 : "+b4);

    }
}
