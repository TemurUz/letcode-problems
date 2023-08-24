package letcode.easy.plus_one;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int a[] = { 9, 9 };
        System.out.println(Arrays.toString(plusOne(a)));
    }

    public static int[] plusOne(int[] digits) {
        int i = digits.length-1;
        while(i >= 0) {
            if(digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
                i--;
            }
        }
        int newD[] = new int[digits.length+1];
        newD[0] = 1;
        return newD;
    }

}
