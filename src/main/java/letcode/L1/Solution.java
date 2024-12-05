package letcode.L1;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int [] nums = {3,2,3};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i ++) {
            for(int j = i + 1; j < nums.length; j ++) {
                int sum = nums[i] + nums[j];

                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
