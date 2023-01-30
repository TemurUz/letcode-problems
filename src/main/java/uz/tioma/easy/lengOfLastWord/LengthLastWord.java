package uz.tioma.easy.lengOfLastWord;

public class LengthLastWord {
    public static void main(String[] args) {
        String s = "                Hello World               2adgs             ";
        System.out.println(1 + " -> " + s);
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String x = s.trim();
        System.out.println("-> "+ x);
        int len = 0;

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' '){
                len = 0;
            }else{
                len++;
            }
        }
        return len;
    }
}
