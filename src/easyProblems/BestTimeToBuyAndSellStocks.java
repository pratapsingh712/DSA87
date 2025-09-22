package easyProblems;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {

        int[] Prices = {7,1,5,3,6,4};

        //let's solve it through optimised way

        int sellOn = 0;

        int bestBuyingPrice = Prices[0];

        int profit;
        int maxProfit = Integer.MIN_VALUE;


        for(int i=1;i<Prices.length;i++){
            sellOn = i;

            profit = Prices[sellOn]- bestBuyingPrice;
            if(profit>maxProfit)
            {
                maxProfit = profit;
            }

            bestBuyingPrice = Math.min(bestBuyingPrice,sellOn);
        }

        System.out.println("Maximum profit made :"+maxProfit);

//        int maxProfit = Integer.MIN_VALUE;
//
//        int buyOn=-1;
//        int sellOn=-1;
//
//        for(int i=0;i<Prices.length;i++){
//            int buy = Prices[i];
//            for(int j=i+1;j<Prices.length;j++){
//                int sell = Prices[j];
//                int diff = sell-buy;
//                if(maxProfit<diff){
//                    maxProfit = diff;
//                    buyOn = i+1;
//                    sellOn = j+1;
//                }
//            }
//        }
//
//        System.out.println("Bought on day :"+buyOn);
//        System.out.println("Sold on day :"+sellOn);
//        System.out.println("Maximum profit made = "+maxProfit);
    }
}
