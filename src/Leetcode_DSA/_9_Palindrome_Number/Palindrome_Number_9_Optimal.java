package Leetcode_DSA._9_Palindrome_Number;
// This is done in Digit Extraction --> (Efficient Approach) -->
// Extract digits one by one and check symmetry using modulus and division operations.
// Complexity O(log N) but half operation.

public class Palindrome_Number_9_Optimal {
    public boolean isPalindrome(int x) {
        int divNumb = x;    // variable to store the state of the number after each division
        int revNumb = 0;    // variable to store the reverse number

        if(x < 0 || (x!= 0 && x%10 ==0))
            // negative numbers can never be palindrome
            // 10, 100, 1000 ... can become palindrome at this logic
            return false;

        if(x >= 0 && x < 10)
            return true;    // 0-9, single digits numbers are always palindrome

        while(divNumb > revNumb){           // Stop when the original number becomes smaller or equal to the reversed half.
            revNumb = (revNumb * 10) + (divNumb % 10);     // Extracting the last digit and building the reverse number
            divNumb = divNumb / 10;                        // dividing to traverse the entire integer.
        }
        if (revNumb/10 == divNumb || revNumb == divNumb)
            // if the original number is equal to reversed number (in case of equal) OR
            // original number is equal to reversed number w/o last digit (in case of smaller)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int numb = 10;
        System.out.println(new Palindrome_Number_9_Efficient().isPalindrome(numb));
    }

}
