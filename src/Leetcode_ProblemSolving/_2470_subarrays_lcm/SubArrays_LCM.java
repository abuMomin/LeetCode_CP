package Leetcode_ProblemSolving._2470_subarrays_lcm;

public class SubArrays_LCM {
    static int lcm_Euclidean (int num_1, int num_2){
        int gcdNum_1 = num_1, gcdNum_2 = num_2;
        while(gcdNum_1 != 0){
            int temp = gcdNum_1;
            gcdNum_1= gcdNum_2 % gcdNum_1;
            gcdNum_2 = temp;
        }
        int gcd = gcdNum_2;

        return (num_1*num_2)/gcd;
    }

    static int subarrayLCM(int[] nums, int k) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int curLCM = nums[i];
            if (curLCM == k) count++;

            for (int j = i + 1; j < nums.length; j++) {
                curLCM = lcm_Euclidean(curLCM, nums[j]);

                if (curLCM == k) count++;
                if (curLCM > k || k % curLCM != 0) break; // optional optimization
            }
        }

        return count;
    }

//    static int[][] generateArrayOfSubArrays(int[] nums) {
//        int totalSubArrays = (nums.length * (nums.length + 1)) / 2;
//        int[][] arrayOfSubArrays = new int[totalSubArrays][];
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i; j < nums.length; j++) {
//                int index = 0;
//                arrayOfSubArrays[count] = new int[(j - i) + 1];
//                for (int k = i; k <= j; k++) {
//                    arrayOfSubArrays[count][index] = nums[k];
//                    index++;
//                }
//                count++;
//            }
//        }
//        return arrayOfSubArrays;
//    }
//    static void printSubArrays(int[] nums){
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i; j < nums.length; j++) {
//                for (int k = i; k <= j; k++) {
//                    System.out.print(nums[k] + " ");
//                }
//                System.out.println();
//            }
//        }
//    }
    public static void main(String[] args) {
        int[] nums = new int[]{5,1,1,1,2};
        int k = 5;
//        printSubArrays(nums);
        int result = subarrayLCM(nums, k);
        System.out.println("The Leetcode main OUTPUT: " + result);
    }
}
