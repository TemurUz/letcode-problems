package letcode.L3264;

import java.util.Arrays;

public class Solution {

    public int[] getFinalState(int[] nums, int k, int multiplier) {

        for (int i = 0; i < k; i++) {
            int[] min = getMin(nums);
            nums[min[1]] = min[0] * multiplier;
        }
        return nums;
    }

    private int [] getMin(int [] nums) {
        int min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                index = i;
            }
        }
        return new int[] {min, index};
    }


    public static void main(String[] args) {
        int [] nums = {2,1,3,5,6};
        int k = 5, multiplier = 2;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.getFinalState(nums, k, multiplier)));
    }
}
