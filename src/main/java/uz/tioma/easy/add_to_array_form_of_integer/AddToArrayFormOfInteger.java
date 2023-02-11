package uz.tioma.easy.add_to_array_form_of_integer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {

    public static List<Integer> addToArrayForm(int[] num, int k) {
        String s = "";
        for (int i : num) {
            s += i +"";
        }
        String k1 = k + "";
        BigInteger arr = new BigInteger(s);
        BigInteger sec = new BigInteger(k1);
        BigInteger add = arr.add(sec);
        String str = add.toString();
        List<Integer> list = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            list.add(ch - '0');
        }
        return list;
    }

    public static void main(String[] args) {
        int[] num = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int k = 1;
        System.out.println(addToArrayForm(num, k));
    }
}
