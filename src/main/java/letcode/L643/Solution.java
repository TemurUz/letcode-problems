package letcode.L643;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double res = 0.00000;



        for (int i = 0; i < k; i ++) {
            if(k >  nums.length) {
                i = 0;
            }

            res += Math.max(nums[i], nums[i + 1]);
            k--;
        }
        return res/4;
    }

    public static void main(String[] args) {
        int [] nums = {1,12,-5,-6,50,3};
        int k = 4;
        Solution solution = new Solution();
        System.out.println(solution.findMaxAverage(nums, k));
    }
}
