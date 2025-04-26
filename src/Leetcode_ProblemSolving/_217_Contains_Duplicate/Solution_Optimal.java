package Leetcode_ProblemSolving._217_Contains_Duplicate;
// solved it using hashset --> Time Complexity: O(n) --> Space Complexity: O(n).
import java.util.HashSet;

public class Solution_Optimal {
    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int num: nums){
            if(hashSet.contains(num))
                return true;
            else hashSet.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
}
