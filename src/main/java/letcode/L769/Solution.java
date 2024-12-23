package letcode.L769;

public class Solution {

    public int maxChunksToSorted(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;

        int count = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (max == i)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,0,1,5,4};
        Solution solution = new Solution();
        System.out.println(solution.maxChunksToSorted(arr));
    }
}
