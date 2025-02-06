package OLD;

import java.util.*;

class atoi_8 {
    public int myAtoi(String s) {
        boolean intFound = false;
        boolean negative = false;
        boolean flag = false;
        boolean operatorFlag = false;
        long num = 0, val = 0;

        for(int i = 0; i < s.length(); i++){
            // First int detect
            if(s.charAt(i) <= '9' && s.charAt(i) >= '0' && intFound == false)
                intFound = true;

            // if -> Blankspaces before number --> ignore, move forward --> continue
            if(s.charAt(i) == ' ' && intFound == false)   {   //  if  "" is provided in input --> tackle with --> || s.charAt(i) == '"' && intFound == false
                if(operatorFlag)
                    break;
                continue;
            }

            // elif -->  Finding `+` operator before number
            else if(s.charAt(i) == '+' && !intFound) {
                // if it is first operator before number --> OKAY
                if (operatorFlag == false)
                    operatorFlag = true;
                // if two operator found before, invalid input --> break, output 0
                else if (operatorFlag == true) {
                    num = 0;
                    break;
                }
                negative = false;
            }
            // elif -->  Finding `-` operator before number
            else if(s.charAt(i) == '-' && intFound == false){
                // if it is first operator before number --> OKAY
                if(operatorFlag == false)
                    operatorFlag = true;
                // if two operator found before, invalid input --> break, output 0
                else if(operatorFlag == true){
                    num = 0;
                    break;
                }
                negative = true;
            }
            // elif number is found
            else if(s.charAt(i) <= '9' && s.charAt(i) >= '0'){
                val = s.charAt(i) - '0';
                num = num*10 + val;
                // if the number exceeds int range --> break --> because enough int accepted
                if (num > (Math.pow(2,31) - 1)){
                    num = (long) (Math.pow(2,31) - 1);
                    flag = true;
                    break;
                }
            }
            // if any space/word/operator found AFTER number
            else
                break;
        }

        if(negative == true && flag == false)
            num = -num;
        else if(negative == true && flag == true)
            num = (-num) - 1;

        return (int)num;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        atoi_8 at = new atoi_8();
        System.out.println(at.myAtoi(str));
    }
}