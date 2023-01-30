package uz.tioma.easy.remove_duplicates_from_sorted_array;

import java.util.Arrays;

/**
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2,2,2,3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i - 1] != nums[i]) {
                nums[count] = nums[i];
                count ++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
}
