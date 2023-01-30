package uz.tioma.easy.minimum_sum;

import java.util.Arrays;

public class MinimumSum {
    public static void main(String[] args) {
        var num = 1468;
        System.out.println(minimumSum(num));
    }

    public static int minimumSum(int num) {
        int arr[] = new int[4];
        int i = 0;
        while(num>0){
            arr[i ++] = num%10;
            num /= 10;
        }
        Arrays.sort(arr);
        return arr[0]*10 + arr[2] + arr[1]*10 + arr[3];
    }
}
