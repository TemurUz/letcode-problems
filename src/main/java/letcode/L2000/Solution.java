package letcode.L2000;

public class Solution {

    public static String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        var s = word.toCharArray();
        int i = 0;

        for (char c : s) {
            if (c == ch) {
                sb.append(c);
                if (i == 0) {
                    sb.reverse();
                }
                i++;
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String word = "abcdefd";
        char ch = 'd';

        word = reversePrefix(word, ch);
        System.out.println(word);
    }
}
