package Leetcode_ProblemSolving._242_Valid_Anagram;
// using array is more efficient.
//
public class Solution_Efficient {

    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] += 1;
            arr[t.charAt(i) - 'a'] -= 1;
        }

        for(int num : arr){
            if(num != 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "rat", t = "car";
        System.out.println(isAnagram(s,t));
    }
}
