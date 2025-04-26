package Leetcode_ProblemSolving._278_First_Bad_Version;
// As the version is sequential from 1 to n, so it is by default sorted.
// The OPTIMAL solution is to apply binary search in this problem.
// Time Complexity: O(log n) - Using binary search which divides search space in half each time
// Space Complexity: O(1) - Only using a constant amount of extra space regardless of input size

import java.util.Scanner;

class VersionControl{
    int size, badStarts;
    static int calling = 0;

    boolean isBadVersion(int n){
        calling++;
        if(n < badStarts) return false;
        else return true;
    }

    VersionControl(int size, int badStarts){
        this.size = size;
        this.badStarts = badStarts;
    }
}

class Solution extends VersionControl{

    Solution(int size, int badStarts) {
        super(size, badStarts);
    }
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while(start < end){
            int mid = start + (end - start) / 2; // Avoid overflow
            if(isBadVersion(mid))
                 end = mid;
            else
                start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.print("Enter total versions : ");
        int size = new Scanner(System.in).nextInt();
        System.out.print("Enter bad version Starts from : ");
        int badversionStarts = new Scanner(System.in).nextInt();        //main codes starts after it.


        Solution solve = new Solution(size, badversionStarts);

        System.out.println("\nBad Version Starts from --> " + solve.firstBadVersion(size) + "\t Called API --> " + solve.calling);
    }
}
