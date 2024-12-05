package letcode.l2678;

public class Solution {

    public int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details) {
            int age = Integer.parseInt(detail.substring(11, 13));
            if (age > 60) {
                count++;
            }
        }
        return  count;
    }

    public int countSeniors2(String[] details) {
        int count = 0;
        for (String detail : details) {
            if (detail.charAt(11) > '6' || detail.charAt(11) == '6' && detail.charAt(12) > '0') count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        String []details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(new Solution().countSeniors2(details));
    }
}
