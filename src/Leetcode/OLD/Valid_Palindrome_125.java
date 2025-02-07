package Leetcode.OLD;

import java.util.Scanner;

public class Valid_Palindrome_125 {
    public boolean isPalindrome(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++){
            int val = s.charAt(i);
            if (val > 47 && val < 58 || val > 64 && val < 91 || val > 96 && val < 123){
                if (val > 64 && val < 91){
                    val = (val - 65) + 97;
                }
                str += (char)val;
            }
        }

        int start = 0, end = str.length() - 1;

        while (start < end){
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ENter a String: ");
        String str = scan.nextLine();

        System.out.println(new Valid_Palindrome_125().isPalindrome(str));
    }
}
