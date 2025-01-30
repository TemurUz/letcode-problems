package leetcode.L916;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list = new ArrayList<>();

        int total = totalLengthWords(words2);
        char[] chars = convertToCharArray(words2, total);



        for (String w1 : words1) {
            int cnt = 0;
            for (char s : chars) {
                if (w1.contains("" +s)) {
                    cnt++;
                }
            }
            if (cnt == total) {
                list.add(w1);
            }
        }
        return list;
    }

    private int totalLengthWords(String[] words) {
        int totalLength = 0;
        for (String w : words) {
            totalLength += w.length();
        }
        return totalLength;
    }

    private char[] convertToCharArray(String[] words2, int totalLength) {
        char[] chars = new char[totalLength];
        int index = 0;

        for (String w : words2) {
            for (char c : w.toCharArray()) {
                chars[index++] = c;
            }
        }
        return chars;
    }

    public static void main(String[] args) {
//        String[] words1 = {"amazon","apple","facebook","google","leetcode"}, words2 = {"e","o"};
//        String[] words1 = {"amazon", "apple", "facebook", "google", "leetcode"}, words2 = {"l", "e"};
        String[] words1 = {"amazon", "apple", "facebook", "google", "leetcode"}, words2 = {"lo", "eo"};
        Solution solution = new Solution();
        System.out.println(solution.wordSubsets(words1, words2));
    }
}
