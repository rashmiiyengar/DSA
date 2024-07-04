package Arrays;


//Leetcode 121
//You are given an array prices where prices[i] is the price of a given stock on the ith day.

//You want to maximize your profit by choosing a single day to buy one 
//stock and choosing a different day in the future to sell that stock.

//Return the maximum profit you can achieve from this transaction. 
//If you cannot achieve any profit, return 0.


//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.


public class StockBuySell {
    public static int maxProfit(int[] prices) {
        
        int maxProfit=0;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            if(prices[i] < min){
                min=prices[i];
            } else if( prices[i]-min > maxProfit){

                maxProfit = prices[i] - min;
            }
        }
         return maxProfit;
    }

    public static void main(String[] args) {
        
        int [] prices = {7,1,5,3,6,4};
        int profit = maxProfit(prices);

        System.out.println(profit);


    }
}
