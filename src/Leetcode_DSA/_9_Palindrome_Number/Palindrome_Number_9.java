package Leetcode_DSA._9_Palindrome_Number;
// This is done in String-Based Approach --> (Suboptimal) -->
// Convert the number to a string and check if it reads the same forward and backward (uses extra space).
public class Palindrome_Number_9 {
    public boolean isPalindrome(int x) {
        boolean ans = true;
        String givenNumber = x+"";
        int maxInd = givenNumber.length() - 1;
        int minInd = 0;
        while(maxInd > minInd){
            if (givenNumber.charAt(maxInd) == givenNumber.charAt(minInd)){
                maxInd--;
                minInd++;
            }
            else{
                ans = false;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int numb = 0;
        System.out.println(new Palindrome_Number_9().isPalindrome(numb));
    }
}
