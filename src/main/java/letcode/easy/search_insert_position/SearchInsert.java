package letcode.easy.search_insert_position;

public class SearchInsert {
    public static void main(String[] args) {
       int[] nums = {1,3,5,6, 8};
       int target = 14;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int x = 0;
        int h = nums.length-1;
        while (l<=h){
            int m = (l+h)/2;
            if (nums[m]==target){
                return m;
            }
            if (nums[m]<target){
                l = m+1;
                x = l;
            }else {
                h = m -1;
                x = h + 1;
            }
        }
        return x;
    }
}
