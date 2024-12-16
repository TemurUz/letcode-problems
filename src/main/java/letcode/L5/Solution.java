package letcode.L5;

public class Solution {

    public static void main(String[] args) {
        String s = "cbbd";
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome2(s));
    }

    public String longestPalindrome2(String s) {
        int l = s.length();
        if (l < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < l; i++) {
            int len1 = expandAroundCenter(s, i, i); // Odd length palindrome
            int len2 = expandAroundCenter(s, i, i + 1); // Even length palindrome
            int len = Math.max(len1, len2);

            if (len > (end - start)) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
