package uz.tioma.easy.happy_number;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n!=1){
            if (!set.contains(n))
                set.add(n);
            else
                return false;
            n = theSquareSum(n);
        }
        return true;
    }

    public static int theSquareSum(int n){
        int res = 0;
        while (n>0){
            res += Math.pow(n%10, 2);
            n = n/10;
        }
        return res;
    }
}
