package Arrays_Assighments;

import Practice_Pattern.Butterfly_Pattern;

public class Stock_Buy_AND_Sell {

    public static int printStockTrading(int Price[]) {

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < Price.length; i++) {

            if(buyPrice < Price[i]) {

                int Profit = Price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, Profit);

            } else {

                buyPrice = Price[i];
            }

        }

        return maxProfit;

    }
    public static void main(String[] args) {

      //  int Price[] = {1, 4, 6, 7, 9, 12, 45, 63, 78};
      //  int Price[] = {9, 8, 6, 4, 3, 1, 0};

        int Price[] = {7, 1, 5, 3, 6, 4};

        printStockTrading(Price);
        System.out.println("Profit & Loss Of Stoack Buy : "+printStockTrading(Price));

    }

}
