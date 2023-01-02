package Arrays;

public class Stock_Buy_AND_Sells_Array {

    public static int printBuyANDSellStock(int Price[]) {

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i <Price.length; i++) {

            if(buyPrice < Price[i]) {  // Profit

                int Profit = Price[i] - buyPrice;  // Today's Profit
                maxProfit = Math.max(maxProfit , Profit); // Global/Annual Profit
            } else {
                buyPrice = Price[i];
            }

        }

        return maxProfit;


    }



    public static void main(String[] args) {

        int Price[] = {7, 1, 5, 3, 6, 4};

     //   int Price[] = {9, 7, 5, 4, 3, 2, 1};    Descending Order Price

     //   int Price[] = {9, 6, 7, 3, 4, 1,5};    Flexible Price
    //    int  Price[] = {7, 1, 5, 3, 6,4};
    //      int Price[] =  {7, 6, 4, 3, 1};




        System.out.println("Profit/Loss Of Stock Is : "+printBuyANDSellStock(Price));

    }


}
