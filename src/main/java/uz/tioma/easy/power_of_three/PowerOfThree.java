package uz.tioma.easy.power_of_three;

public class PowerOfThree {
    public static void main(String[] args) {
        int n = 1;
//        System.out.println(isPowerOfThree(n));
//        System.out.println(isPowerOfTwo(n));
        System.out.println(isPowerOfFour(n));
    }

    public static boolean isPowerOfThree(int n) {
        int a = 3;
        double p = Math.log10(n)/ Math.log10(a);
        return p - (int) p == 0;
    }

    public static boolean isPowerOfTwo(int n) {
        int a = 2;
        double p = Math.log10(n)/ Math.log10(a);
        return p - (int) p == 0;
    }

    public static boolean isPowerOfFour(int n) {
        int a = 4;
        double p = Math.log10(n)/ Math.log10(a);
        return p - (int) p == 0;
    }
}
