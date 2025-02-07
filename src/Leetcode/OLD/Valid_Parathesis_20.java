package Leetcode.OLD;

import java.util.Scanner;

public class Valid_Parathesis_20 {

    // Array straight forward approach. --> O(n)
    public boolean isValid(String s) {
        int size = s.length();
        int length = 0;
        char[] stack = new char[size];

        for (int i = 0; i < size; i++){
            char bracket = s.charAt(i);
            if(bracket == '(' || bracket == '{' || bracket == '['){
                stack[length] = bracket;
                length++;
            }
            else if(bracket == ')' || bracket == '}' || bracket == ']'){
                if (length == 0)
                    return false;
                if (bracket == ')' && stack[length - 1] == '(')
                    length--;
                else if(bracket == '}' && stack[length - 1] == '{')
                    length--;
                else if (bracket == ']' && stack[length - 1] == '[')
                    length--;
                else
                    return false;
            }
        }
        if (length != 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Valid_Parathesis_20().isValid(new Scanner(System.in).next()));
    }
}
