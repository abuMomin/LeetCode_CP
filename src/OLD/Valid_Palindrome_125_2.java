package Leetcode_DSA.OLD;

import java.util.Scanner;

public class Valid_Palindrome_125_2 {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int start = 0, end = str.length()-1;
        while (start < end){
            if(!(str.charAt(start) >= 'a' && str.charAt(start) <= 'z') && !(str.charAt(start) >= '0' && str.charAt(start) <= '9')){
                start++;
                continue;
            }

            if(!(str.charAt(end) >= 'a' && str.charAt(end) <= 'z') && !(str.charAt(end) >= '0' && str.charAt(end) <= '9')){
                end--;
                continue;
            }

            if (str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();

        System.out.println(new Valid_Palindrome_125_2().isPalindrome(str));
    }
}
