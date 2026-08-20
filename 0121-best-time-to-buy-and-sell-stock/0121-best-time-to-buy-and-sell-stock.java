class Solution {
    public int maxProfit(int[] prices) {
        int cp = Integer.MAX_VALUE;
        int mxProfit = 0;
        for(int i = 0; i<prices.length; i++){
            if(cp<prices[i]){
                int profit = prices[i] - cp;
                mxProfit = Math.max(mxProfit, profit);
            }
            else{
                cp= prices[i];
            }
        }
        return mxProfit;
    }
}