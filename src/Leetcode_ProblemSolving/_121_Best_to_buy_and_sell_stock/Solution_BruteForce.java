package Leetcode_ProblemSolving._121_Best_to_buy_and_sell_stock;
// Brute-force approach  --> Time Complexity O(n^2), Space Complexity O(1) -->
public class Solution_BruteForce {

    static int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0; i < prices.length - 1; i++){
            for(int j = i+1; j < prices.length; j++){
               profit = Math.max(profit, prices[j] - prices[i]);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
