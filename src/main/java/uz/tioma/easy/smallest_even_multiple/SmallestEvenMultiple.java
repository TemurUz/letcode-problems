package uz.tioma.easy.smallest_even_multiple;

public class SmallestEvenMultiple {
    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(10));
    }

    public static int smallestEvenMultiple(int n) {
        if(n%2 == 0)
            return n;
        return 2*n;
    }

}
