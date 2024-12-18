package letcode.L643;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++)
            sum += nums[i];

        int maxSum = sum;
        int len = nums.length;
        for (int i = k; i < len; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        Solution solution = new Solution();
        System.out.println(solution.findMaxAverage(nums, k));
    }

    // l=6 k=4
}
