package letcode.easy.longest_common_perfex;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String strs [] = {"fower","fow","fight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        int minLength = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            minLength = Math.min(minLength, strs[i].length());
        }

        for (int i = 0; i < minLength; i++) {
            char s = strs[0].charAt(i);
            for(String str: strs){
                if (str.charAt(i) != s){
                    return res.toString();
                }
            }
            res.append(s);
        }
        return res.toString();
    }

}
