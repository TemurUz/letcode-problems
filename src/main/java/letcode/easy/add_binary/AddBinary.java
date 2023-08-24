package letcode.easy.add_binary;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1101", "1"));
    }

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder res = new StringBuilder();
        res.append(5);
        res.append(4);
        System.out.println(res);
        int carry = 0;
        while (i >= 0 || j >= 0){
            int sum = carry;
            if (i >= 0){
                sum += a.charAt(i --) - '0';
            }
            if (j>=0){
                sum += b.charAt(j --) - '0';
            }
            res.insert(1, sum%2);
            carry = sum/2;
        }
        if (carry > 0) {
            res.insert(0, 1);
        }
        return res.toString();
    }
}
