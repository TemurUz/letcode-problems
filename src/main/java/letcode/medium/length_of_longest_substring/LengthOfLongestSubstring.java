package letcode.medium.length_of_longest_substring;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        char [] h = s.toCharArray();
        StringBuilder g = new StringBuilder();
        for (int i = 0; i < h.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (!(h[i] == h[j])){
                    g.append(h[i]);
                }
            }
        }
        return max;
    }
}
