package letcode.easy.reverse_stringII541;

public class ReverseStringII {

    public static String reverseStr(String s, int k) {
        String res = "";
        int n = s.length();

        for (int j = k; j <= n - k; j += k) {
            String dummy = s.substring(k);
            char [] r = s.substring(0, k).toCharArray();
            StringBuilder rev = new StringBuilder();
            for (int i = r.length - 1; i >= 0; i--){
                rev.append(r[i]);
            }
            if (j <= s.length()){
                res += rev + s.substring(j, j + k);
            }else {
                res += rev + s.substring(k);
            }
            if (k<dummy.length()){
                s= dummy.substring(k);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abcferew";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }
}
