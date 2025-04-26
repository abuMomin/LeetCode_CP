package Leetcode_ProblemSolving._217_Contains_Duplicate;
// Solved it using hashmap --> Time Complexity: O(n) --> Space Complexity: O(n). 
// But using hashmap is not the best approach. hashset is better.
import java.util.HashMap;

public class Solution_Efficient {

    static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i]))
                return true;
            else{
                hashMap.put(nums[i], nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
}
