package uz.tioma.easy.differenceOf_sum;

public class DifferenceOfSum {
    /**
     * 2535. Difference Between Element Sum and Digit Sum of an Array
     *
     * You are given a positive integer array nums.
     *
     * The element sum is the sum of all the elements in nums.
     * The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
     * Return the absolute difference between the element sum and digit sum of nums.
     *
     * Note that the absolute difference between two integers x and y is defined as |x - y|.
     */
    public static void main(String[] args) {
        int[] nums = {1, 15, 6, 3};
        System.out.println(differenceOfSum(nums));
    }

    public static int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int num : nums) {
            elementSum += num;
            while (num > 0) {
                if (num < 10) {
                    digitSum += num;
                } else {
                    digitSum += num % 10;
                }
                num /= 10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}
