package leetcode.L2661;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int a = arr.length;

        int row = mat.length, column = mat[0].length; // row = m, column = n
        int index = 0;

        Map<String, Integer> m1 = new HashMap<>();
        int[][] pos = new int[row * column + 1][2];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                pos[mat[i][j]] = new int[]{i, j};
            }
        }

        while (index < a) {
            int[] curr = pos[arr[index]];
            int i = curr[0];
            int j = curr[1];
            m1.put("R" + i, m1.getOrDefault("R" + i, 0) + 1);
            m1.put("C" + j, m1.getOrDefault("C" + j, 0) + 1);
            if (m1.get("R" + i) == column || m1.get("C" + j) == row) {
                return index;
            }
            index++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2};
        int[][] mat = {{1, 4}, {2, 3}};
        Solution solution = new Solution();
        System.out.println(solution.firstCompleteIndex(arr, mat));
    }
}
