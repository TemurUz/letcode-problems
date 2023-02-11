package uz.tioma;

public class Main {
    public static void main(String[] args) {
//        printDigits(154);
//        System.out.println(reverseDigits(710));
//        System.out.println(convertToBinary(13));
//        System.out.println(isPowerOfTwo(15));
//        shiftOperation();
        System.out.println(sumOfOddNumbers(5));
    }

    /**
     Berilgan son raqamlarini ekranga chiqaring.
     Misol uchun, printDigits(154) chaqirilganda, quyidagilar ekranga chiqarishi kerak:
     4
     5
     1
     */
    public static void printDigits(int num) {
        while (num > 0) {
            System.out.println(num % 10);
            num /= 10;
        }
    }

    /**
     Berilgan son raqamlariga teskari son qaytaring.
     Misol uchun:
     reverseDigits(154) => 451
     reverseDigits(710) => 17
     */
    public static int reverseDigits(int num){
        int res = 0;
        while (num>0){
            res = num%10 + res*10;
            num /= 10;
        }
        return res;
    }

    /**
     Berilgan sonni ikkilik sanoqga o'tkazing.
     Misol uchun:
     convertToBinary(6) => "110"
     convertToBinary(13) => "1101"
     */
    public static String convertToBinary(int num){
        StringBuilder res = new StringBuilder();
        while (num>0){
            res.insert(0,num%2);
            num /=2;
        }
        return res.toString();
    }

    /**
     * Berilgan son ikkining darajasi ekanligiga tekshiring.
     * @param num = 16 , 14 , 64, 20, 21 ....
     * @return isPowerOfTwo(16) => true / isPowerOfTwo(15) => false
     */
    public static boolean isPowerOfTwo(int num){
        if (num == 0)
            return false;
        while (num != 1) {
            if (num % 2 != 0)
                return false;
            num /=  2;
        }
        return true;
    }

    /**
     * 10 ikkilikda -> 1010 a>>1 -> 101 = 5
     * 10 ikkilikda -> 1010 a>>2 -> 10 = 2
     * 10 ikkilikda -> 1010 a>>3 -> 1 = 1
     * 5  ikkilikda ->  0101
     */
    public static void shiftOperation(){
        int a = 10;
        System.out.println(a>>2);
    }

    public static int sumOfOddNumbers(int n){
        return (n+1) * (n-1)/2;
    }

}