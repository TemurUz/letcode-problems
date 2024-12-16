package letcode.L268;

import java.util.Arrays;

public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        int actualSum = Arrays.stream(nums).sum();
        return sum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1};
        Solution solution = new Solution();
        System.out.println(solution.missingNumber(nums));
    }
}
