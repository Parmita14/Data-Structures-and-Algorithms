class Solution {
    public int maxProfit(int[] prices) {
       int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyprice < prices[i]){ // profit
                int profit = prices[i] - buyprice; // current day price
                maxprofit = Math.max(maxprofit,profit);
                
            }else
            {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }
}