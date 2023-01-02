package Loops;

public class While_Loops_I {

    public static void main(String[] args) {

        int counter = 0;
        while (counter < 100) {
            System.out.println("Hello World !");
            counter += 1;  // counter++;
        }
        System.out.println("Number Of Time Print Hello World ! : "+counter);
    }

}
