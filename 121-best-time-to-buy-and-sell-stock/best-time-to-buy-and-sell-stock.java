class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = prices[0];
        int profit = 0;

        // loop to find the value at each index
        for(int i = 1; i< prices.length;i++){
            //comparison
            if(prices[i] < buyprice){ // prices[i] is a new price
            buyprice = prices[i];
            }else{
            int currentprofit = prices[i] - buyprice;
            profit = Math.max(currentprofit,profit);
        }
        }
        
    
    return profit;
}
    }