package Leetcode_ProblemSolving._242_Valid_Anagram;
// built using hashmap
// Time Complexity --> O(n+m), Space Complexity --> O(1) since we have at most 26 different characters
import java.util.HashMap;
public class Solution {

    static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMap_1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hashMap_2 = new HashMap<Character, Integer>();
        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            Character s_char = (Character) s.charAt(i);
            Character t_char = (Character) t.charAt(i);
            if (hashMap_1.containsKey(s_char)) {
                hashMap_1.put(s_char, hashMap_1.getOrDefault(s_char,0) + 1);
            }
            else {
                hashMap_1.put(s_char, 1);
            }
            if (hashMap_2.containsKey(t_char)) {
                hashMap_2.put(t_char, hashMap_2.getOrDefault(t_char, 0) + 1);
            }
            else {
                hashMap_2.put(t_char, 1);
            }
        }

        if (hashMap_1.equals(hashMap_2))
            return true;
        else return false;
    }


    public static void main(String[] args) {
        String str1 = "anagram", str2 = "nagaram";
        System.out.println(isAnagram(str1, str2));
    }
}
