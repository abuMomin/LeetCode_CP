package Leetcode_ProblemSolving._121_Best_to_buy_and_sell_stock;
// Two Pointer Approach --> Time Complexity O(n), Space Complexity O(1) --> Optimal Approach.
public class Solution_TwoPointer_Optimal {
    static int maxProfit(int[] prices) {
       int maxProfit = 0, left = 0, right = 1;

       while(right < prices.length){
           if(prices[right] <= prices[left]){
               left = right;
           }
           else{
               maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
           }
           right++;
       }

       return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {3,2,6,5,0,3};
        System.out.println(maxProfit(prices));
    }
}
