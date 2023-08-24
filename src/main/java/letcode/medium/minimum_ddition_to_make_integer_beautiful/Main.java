package letcode.medium.minimum_ddition_to_make_integer_beautiful;

public class Main {
    public static void main(String[] args) {
        int n = 734504727, target = 10;
        System.out.println(makeIntegerBeautiful(n, target));
    }

    public static long makeIntegerBeautiful(long n, int target) {
        long x = n, base = 1;
        while (sum(n)>target){
            n = n/10 + 1;
            base *=10;
        }
        return n * base - x;
    }

    public static long sum(long n){
        int res = 0;
        while (n>0) {
            res += n%10;
            n = n/10;
        }
        return res;
    }

//    public static long makeIntegerBeautiful1(long n, int target) {
//        long x = 0, i = 0;
//        long s = n;
//        boolean check = true;
//        while (check){
//            while (n>0) {
//                x += n%10;
//                n = n/10;
//            }
//            if (x>target){
//                n = ++s;
//                x=0;
//                i++;
//            }else {
//                check = false;
//            }
//        }
//        return i;
//    }
}
