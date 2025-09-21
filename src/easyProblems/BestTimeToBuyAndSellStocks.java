package easyProblems;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {

        int[] array = {7,1,5,3,6,4};

        int maxProfit = Integer.MIN_VALUE;

        int buyOn=-1;
        int sellOn=-1;

        for(int i=0;i<array.length;i++){
            int buy = array[i];
            for(int j=i+1;j<array.length;j++){
                int sell = array[j];
                int diff = sell-buy;
                if(maxProfit<diff){
                    maxProfit = diff;
                    buyOn = i+1;
                    sellOn = j+1;
                }
            }
        }

        System.out.println("Bought on day :"+buyOn);
        System.out.println("Sold on day :"+sellOn);
        System.out.println("Maximum profit made = "+maxProfit);
    }
}
