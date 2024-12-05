package letcode.L2337;

public class Solution {

    public static void main(String[] args) {
        String start = "_L__R__R_", target = "L______RR";
        System.out.println(canChange(start, target));
    }

    public static boolean canChange(String start, String target) {

        if (start.equals(target)) return true;

        int l = 0, r = 0;

        for (int i = 0; i < start.length(); i++) {
            char st = start.charAt(i);
            char ta = target.charAt(i);
            if (st == 'R') {
                if (l > 0) {
                    return false;
                }
                r ++;
            }

            if (ta == 'L') {
                if (r > 0) {
                    return false;
                }
                l ++;
            }

            if (ta == 'R') {
                if (r == 0) {
                    return false;
                }
                r --;
            }

            if (st == 'L') {
                if (l == 0) {
                    return false;
                }
                l --;
            }
        }

        return l == 0 && r == 0;
    }
}
