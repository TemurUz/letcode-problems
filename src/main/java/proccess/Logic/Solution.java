package proccess.Logic;

public class Solution {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        if (x++ != 0 && y++ != 0) { // Same condition as in C++
            y += 2;
        }
        System.out.println(x+y);
    }
}
