package leetcode.L2342;

public class Solution {
    public int maximumSum(int[] nums) {
        int l = nums.length;
        int max = -1;
        for (int i = 0; i < l-1; i++) {
            int sum_i = sum(nums[i]);
            for (int j = i + 1; j < l ; j++) {
                int sum_j = sum(nums[j]);
                if (sum_i == sum_j) {
                    int s = nums[i] + nums[j];
                    if (s > max) {
                        max = s;
                    }
                }
            }
        }
        return max;
    }

    private int sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] nums = {4,6,10,6};
        Solution solution = new Solution();
        System.out.println(solution.maximumSum(nums));
    }
}
