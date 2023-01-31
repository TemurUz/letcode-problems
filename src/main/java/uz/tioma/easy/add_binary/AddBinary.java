package uz.tioma.easy.add_binary;

public class AddBinary {
    /**
     * Given two binary strings a and b, return their sum as a binary string.
     */
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder res = new StringBuilder();
        res.append(0);
        res.append(1);
        int carry = 0;
        while (i >= 0 || j >= 0){
            int sum = carry;
            if (i >= 0) sum += a.charAt(i --) - '0';
            if (j>=0) sum += b.charAt(j --) - '0';
            res.insert(1, sum%2);
            carry = sum/2;
        }
        if (carry > 0) res.insert(1, 1);
        return res.substring(1, res.length() - 1);
    }
}
