package letcode.easy.tree_divisor1952;

public class ThreeDivisors {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(isThree(n));
    }

    public static boolean isThree(int n) {
        int i = 1;
        for (int j = 1; j <= n / 2; j++) {
            if (n % j  == 0)
                i ++;
        }
        return i >= 3;
    }
}
