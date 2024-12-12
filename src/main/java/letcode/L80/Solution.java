package letcode.L80;

public class Solution {

    public int removeDuplicates(int[] nums) {
        int n = 2, l = nums.length;

        for (int i = 2; i < l; i++) {
            if (nums[i] != nums[n - 2]) {
                nums[n] = nums[i];
                n++;
            }
        }

        return n;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }
}
