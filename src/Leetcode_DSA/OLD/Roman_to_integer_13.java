package Leetcode_DSA.OLD;

import java.util.HashMap;
import java.util.Scanner;

public class Roman_to_integer_13 {
    public static void main(String[] args) {
        System.out.print("ENter the ROman Number : ");
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        String romanNum = scan.next();
        int sum = 0, prevValue = 0;
        for (int i = romanNum.length() - 1; i >= 0; i--){
//            int currentVal = map.get(String.valueOf(romanNum.charAt(i)));
//            int nextVal = map.get(String.valueOf(romanNum.charAt(i+1)));
//            if (currentVal >= nextVal){
//                sum += currentVal;
//            }else{
//                sum += (nextVal - currentVal);
//                i++;
//            }
            int currentVal = map.get(String.valueOf(romanNum.charAt(i)));
            if (currentVal < prevValue){
                sum -= currentVal;
            }
            else{
                sum += currentVal;
            }
            prevValue = currentVal;
        }
        System.out.println("The number in English is = " + sum);
    }
}
