package letcode.easy.reverse_integer;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = -15342369;
        System.out.println(" sss " + reverse(x));
    }

    public static int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        long s = 0;
        while (x > 0) {
            s = s*10 + x%10;
            x = x / 10;
        }
        if (s > Integer.MAX_VALUE){
            return 0;
        }
        return (int) (isNegative ? -s : s);
    }
}
