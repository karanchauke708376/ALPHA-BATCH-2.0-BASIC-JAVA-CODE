package Function_AND_Method;

public class Function_Product_aXb {

    public static int multply(int a , int b) {

        int product = a * b;
        return product;
    }

    public static void main(String[] args) {

        int a = 0 ;
        int b = 0;


       int newProd = multply(3 , 4);
        System.out.println("A * B =  "+newProd);
        newProd = multply(10 , 20);
        System.out.println("A * B =  "+newProd);



    }
}
