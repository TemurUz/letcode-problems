package letcode.L2762;

public class Solution {

    public int countSubarrays(int[] nums) {
        int n = nums.length;
        int start = 0; // Oynaning boshlanish nuqtasi
        int result = 0;
        int min = nums[0]; // Oynadagi minimal qiymat
        int max = nums[0]; // Oynadagi maksimal qiymat

        for (int end = 0; end < n; end++) {
            // Yangi elementni oyna ichiga qo‘shamiz
            min = Math.min(min, nums[end]);
            max = Math.max(max, nums[end]);

            // Agar shart buzilsa, oynani qisqartiramiz
            while (max - min > 2) {
                start++;
                // Oynani yangilash uchun minimal va maksimal qiymatlarni qayta hisoblaymiz
                min = nums[start];
                max = nums[start];
                for (int k = start; k <= end; k++) {
                    min = Math.min(min, nums[k]);
                    max = Math.max(max, nums[k]);
                }
            }

            // Har bir qadamda hosil bo‘ladigan kichik massivlar sonini hisoblaymiz
            result += (end - start + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 2, 4};
        Solution solution = new Solution();
//        System.out.println(solution.continuousSubarrays(nums));
        System.out.println(solution.countSubarrays(nums));
    }
}
