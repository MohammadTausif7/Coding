class LC0121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int i = 0, j = 1, profit = 0;
        while (j < prices.length)
        {
            if (prices[j] - prices[i] >= 0)
            {
                profit = Math.max(profit, prices[j] - prices[i]);
                j++;
            }
            else
                
            {
                i++;
            }
        }
        return profit;
    }
}