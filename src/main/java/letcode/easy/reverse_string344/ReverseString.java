package letcode.easy.reverse_string344;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        System.out.println(Arrays.toString(s));
        char[] rev = new char[s.length];
        int j = 0;
        for (int i = s.length - 1; i >= 0; i--){
            rev[j] = s[i];
            j++;
        }
        for (int i = 0; i < rev.length; i++) {
            s[i] = rev[i];
        }
    }
}
