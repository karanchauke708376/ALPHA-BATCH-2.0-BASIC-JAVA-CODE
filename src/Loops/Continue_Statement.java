package Loops;

public class Continue_Statement {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Skip 3 Number Using Continue Statements  : ");


    }
}

