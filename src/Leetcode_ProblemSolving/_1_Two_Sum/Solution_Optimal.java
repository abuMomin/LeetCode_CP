package Leetcode_ProblemSolving._1_Two_Sum;
// Using Hashmap --> Time Complexity O(n)
import java.util.HashMap;

public class Solution_Optimal {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remaining = target -nums[i];
            if (hashMap.containsKey(remaining)){
                return new int[]{hashMap.get(remaining), i};
            }
            else{
                hashMap.put(nums[i], i);
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] res_arr = twoSum(nums, target);
        System.out.println(res_arr[0] + "\t" + res_arr[1]);
    }
}
