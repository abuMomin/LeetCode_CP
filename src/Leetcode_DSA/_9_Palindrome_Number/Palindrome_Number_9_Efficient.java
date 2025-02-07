package Leetcode_DSA._9_Palindrome_Number;
// This is done in Digit Extraction --> (Efficient Approach) -->
// Extract digits one by one and check symmetry using modulus and division operations.
// Complexity O(log N) but full reverse operation.

public class Palindrome_Number_9_Efficient {
    public boolean isPalindrome(int x) {
        int divNumb = x;    // variable to store the state of the number after each division
        int revNumb = 0;    // variable to store the reverse number

        if(x < 0)           // negative numbers can never be palindrome
            return false;

        while(divNumb != 0){
            revNumb = (revNumb * 10) + (divNumb % 10);     // Extracting the last digit and building the reverse number
            divNumb = divNumb / 10;                        // dividing to traverse the entire integer.
        }
        if (x == revNumb)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int numb = 101;
        System.out.println(new Palindrome_Number_9_Efficient().isPalindrome(numb));
    }

}
