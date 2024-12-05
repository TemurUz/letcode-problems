package letcode.L1876;

public class Solution {

    public static int countGoodSubstrings(String s) {
        int l = s.length();
        int count = 0;
        for (int i = 0; i < l - 2; i++) {
            String sub = s.substring(i, i + 3);

            if (sub.charAt(0) != sub.charAt(1) && sub.charAt(0) != sub.charAt(2) && sub.charAt(1) != sub.charAt(2)) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "xyzzaz";

        System.out.println(countGoodSubstrings(s));
    }
}
