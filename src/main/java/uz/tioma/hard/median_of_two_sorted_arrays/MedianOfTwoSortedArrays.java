package uz.tioma.hard.median_of_two_sorted_arrays;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
       int[] nums1 = {1,2}; int[]nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] newArr = new int[n];
        int ans = 0;
        double medium = 0;
        int j = 0;

        for (int i = 0; i < nums1.length; i++) {
            newArr[i] = nums1[i];
        }

        for (int i = nums1.length; i < n; i++) {
            newArr[i] = nums2[j];
            j++;
        }
        Arrays.sort(newArr);
        if (n%2 == 0){
            ans = n/2;
            medium =  (double) (newArr[ans] + newArr[ans - 1])/2;
        }else {
            ans = n/2;
            medium = newArr[ans];
        }
        return medium;
    }
}
