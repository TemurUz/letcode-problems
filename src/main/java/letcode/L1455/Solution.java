package letcode.L1455;

public class Solution {


    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("this problem is an easy problem", "pro"));
    }


    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] s = sentence.split(" ");

        for (int i = 0; i < s.length; i++) {
            if (s[i].startsWith(searchWord)) {
                return i + 1;
            }
        }

        return -1;
    }
}
