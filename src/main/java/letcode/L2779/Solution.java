package letcode.L2779;

import java.util.Arrays;

public class Solution {

    public int maximumBeauty(int[] nums, int k) {
        int result = 0, count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] - nums[count] > 2 * k) {
                count++;
            }
            result = Math.max(result, i - count + 1);
        }
        return result;
    }

    public int maximumBeauty1(int[] nums, int k) {
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {4, 6, 1};
        int k = 2;
        Solution solution = new Solution();
        System.out.println(solution.maximumBeauty(nums, k));
    }

}
