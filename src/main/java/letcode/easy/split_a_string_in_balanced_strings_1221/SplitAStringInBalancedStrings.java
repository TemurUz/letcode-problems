package letcode.easy.split_a_string_in_balanced_strings_1221;

public class SplitAStringInBalancedStrings {

    public static void main(String[] args) {
        String s = "RLLRRLRRRLLLRRL";
        System.out.println(balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s) {
        int res = 0, cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') cnt -= 1;
            else cnt += 1;

            if (cnt == 0) res += 1;
        }
        return res;
    }
}
