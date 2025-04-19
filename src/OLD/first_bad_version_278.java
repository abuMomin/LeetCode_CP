package Leetcode_DSA.OLD;

import java.util.Scanner;

class VersionControl{
    boolean[] version;
    static int calling = 0;
    boolean isBadVersion(int n){
        calling++;
        return version[n];
    }
    VersionControl(int size, int badStarts){
        version = new boolean[size];
        for (int i = 0; i < size; i++){
            if(i < badStarts - 1)
                version[i] = false;
            else
                version[i] = true;
        }
    }
}

class Solution extends VersionControl{

    Solution(int size, int badStarts) {
        super(size, badStarts);
    }
    public int firstBadVersion(int n) {
        //applying binary search to find bad version
        long start = 0, mid = 0, end = n-1;
        while (start <= end){
            mid = (start+end)/2;
            if (isBadVersion((int)mid) == true){
                if (mid == 0)
                    return (int)mid+1;
                else if (isBadVersion((int)mid - 1) == false)
                    return (int)mid+1;
                else
                    end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}

public class first_bad_version_278 {
    public static void main(String[] args) {
        // For practice --> not related with problem
        System.out.print("Enter total versions : ");
        int size = new Scanner(System.in).nextInt();
        System.out.print("Enter bad version Starts from : ");
        int badversionStarts = new Scanner(System.in).nextInt();
        //main codes starts after it.

        Solution solve = new Solution(size, badversionStarts);
//        for (int i = 0; i < size; i++){
//            System.out.print(solve.isBadVersion(i) + "\t");
//        }
        System.out.println("\nBad Version Starts from --> " + solve.firstBadVersion(size) + "\t Called API --> " + solve.calling);
    }
}
