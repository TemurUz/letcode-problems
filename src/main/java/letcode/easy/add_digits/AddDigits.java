package letcode.easy.add_digits;

public class AddDigits {
    public static void main(String[] args) {
        var num = 19;
        System.out.println(addDigits(num));
    }

    public static int addDigits(int num) {
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num = num/10;
        }
        if (sum >= 10)
            return addDigits(sum);
        return sum;
    }
}
