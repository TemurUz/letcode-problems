package letcode.L2825;

public class Solution {
    public static void main(String[] args) {
        String str1 = "oh";
        String str2 = "hu";
        System.out.println(canMakeSubsequence1(str1, str2));
    }

    public static boolean canMakeSubsequence(String str1, String str2) {

        int l1 = str1.length(), l2 = str2.length();
        int start2 = 0;

        for (int i = 0; i < l1 && start2 < l2; ++i) {
            if (
                    str1.charAt(i) == str2.charAt(start2) ||
                    str1.charAt(i) + 1 == str2.charAt(start2) ||
                    str1.charAt(i) - 25 == str2.charAt(start2)
            ) {
                start2++;
            }
        }
        return start2 == l2;
    }

    public static boolean canMakeSubsequence1(String str1, String str2) {
        int l1 = str1.length(), l2 = str2.length();
        int start1 = 0;
        int start2 = 0;

        while (start1 < l1 && start2 < l2) {
            ++start1;
            if (
                    str1.charAt(start1) == str2.charAt(start2) ||
                    str1.charAt(start1) + 1 == str2.charAt(start2) ||
                    str1.charAt(start1) - 25 == str2.charAt(start2)
            ) {
                start2++;
            }
        }
        return start2 == l2;
    }
}
