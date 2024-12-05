package letcode.L2109;

public class Solution {
    public static void main(String[] args) {
        String s = "EnjoyYourCoffee";
        int [] spaces = { 5, 9 };
        System.out.println(addSpaces(s, spaces));
    }

    public static String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();

        int space = 0;

        for (int j : spaces) {
            sb.append(s, space, j);
            sb.append(" ");
            space = j;
        }
        sb.append(s, space, s.length());
        return sb.toString();
    }
}
