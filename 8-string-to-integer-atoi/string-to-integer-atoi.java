class Solution {
    public int myAtoi(String s) {

        s = s.trim();

        if(s.length() == 0){
            return 0;
        }

        int sign = 1;
        int i = 0;
        int num = 0;

        // check sign
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){

            if(s.charAt(0) == '-'){
                sign = -1;
            }

            i++;
        }

        // convert string to integer
        while(i < s.length() && Character.isDigit(s.charAt(i))){

            int digit = s.charAt(i) - '0';

            // overflow check
            if(num > (Integer.MAX_VALUE - digit) / 10){

                if(sign == 1){
                    return Integer.MAX_VALUE;
                }
                else{
                    return Integer.MIN_VALUE;
                }
            }

            num = num * 10 + digit;

            i++;
        }

        return num * sign;
    }
}