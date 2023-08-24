package letcode.easy.power_of_three.number_of_bits191;

public class NumberOfBits {
    public static void main(String[] args) {
        int n = 00000000000000000000000000000111;
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        for (;n!=0;n = n & (n-1))
            count++;
        return count;
    }
}
