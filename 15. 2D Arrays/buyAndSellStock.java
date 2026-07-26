public class buyAndSellStock {
    public static void buyAndSellStack(int prices[] ) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        System.out.println(maxProfit);
    }
 public static void main(String[] args) {
    int prices [] = {3,5,6,8,9,10};
   buyAndSellStack(prices);
 }   
}
