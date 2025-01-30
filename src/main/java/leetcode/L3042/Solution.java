package leetcode.L3042;

public class Solution {

    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;

        int count = 0;
        for (int i = 0; i < n; i++) {
            String word = words[i];
            for (int j = i + 1; j < n; j++) {
                String in = words[j];
                if (in.startsWith(word) && in.endsWith(word)) {
                    count ++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] words = {"a", "aba", "ababa", "aa"};
        Solution solution = new Solution();
        System.out.println(solution.countPrefixSuffixPairs(words));
    }
}
