package OLD;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Contains_duplicate_217 {
    /*
    //Using HashMap
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++){
            if (!hashMap.containsKey(nums[i]))
                hashMap.put((Integer) nums[i], (Integer) i);
            else
                return true;
        }
        return false;
    }
     */

    // Optimal Way --> Build using HashSet
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            if (hashSet.contains((Integer)nums[i]))
                return true;
            hashSet.add((Integer) nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i< size; i++){
            nums[i] = scan.nextInt();
        }

        System.out.println( new Contains_duplicate_217().containsDuplicate(nums));
    }
}
