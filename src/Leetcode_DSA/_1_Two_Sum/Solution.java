package Leetcode_DSA._1_Two_Sum;
// Complexity is in O(n^2). Brute force approach.
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] res_arr = twoSum(nums, target);
        System.out.println(res_arr[0] + "\t" + res_arr[1]);
    }
}
