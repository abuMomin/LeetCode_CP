package Leetcode_DSA.OLD;

import java.util.Scanner;

// Can be solved using array --> Runtime: O(n2)
// Can be solved using Arraylist --> Runtime: O(n2)
// optimally solution is using HashMap --> Runtime; O(n)
public class Valid_Anagram_242 {
    /*
     //using ArrayList is bad idea
     public boolean isAnagram(String s, String t) {
         ArrayList<Character> arrayList = new ArrayList<Character>();

         for (int i = 0;  i < s.length(); i++){
             arrayList.add((Character) s.charAt(i));
         }

         for (int j = 0; j < t.length(); j++){
             boolean ret = arrayList.remove((Character) t.charAt(j));
             if (!ret)
                 return false;
         }

         if(arrayList.size() == 0)
             return true;
         else
             return false;

     }

     */

    //let's try with array
    public boolean isAnagram(String s, String t){
        if (s.length() != t.length())
            return false;
        int[] arr = new int[26]; // as only small a-z will be INPUT

        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int num: arr){
            if (num != 0)
                return false;
        }
        return true;
    }

    //Lets try with hashmap
//    public boolean isAnagram(String s, String t) {
//
//    }

    public static void main(String[] args) {
        String str1 = new Scanner(System.in).next();
        String str2 = new Scanner(System.in).next();

        System.out.println(new Valid_Anagram_242().isAnagram(str1, str2));
    }
}
