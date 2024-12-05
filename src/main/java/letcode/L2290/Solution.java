package letcode.L2290;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {

    private static final int[] d = {0, 1, 0, -1, 0};

    public static int minimumObstacles(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[] dist = new int[m * n]; // 1D new integer array

        Arrays.fill(dist, Math.max(m,n));
        dist[0] = 0;

        Deque<int[]> deque = new ArrayDeque<>();
        deque.offerFirst(new int[]{0, 0});

        while (!deque.isEmpty()) {
            int[] current = deque.pollFirst();
            int d1 = current[0], idx = current[1];
            int i = idx / n, j = idx % n;
            if (i == m - 1 && j == n - 1) return d1;

            for (int a = 0; a < 4; ++a) {
                int r = i + d[a], c = j + d[a + 1];

                if (r < 0 || r >= m || c < 0 || c >= n) continue;

                int d2 = d1 + grid[r][c];
                int idx2 = r * n + c;

                if (d2 < dist[idx2]) {
                    dist[idx2] = d2;
                    if (grid[r][c] == 0) {
                        deque.offerFirst(new int[]{d2, idx2});
                    } else {
                        deque.offerLast(new int[]{d2, idx2});
                    }
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[][] grid = {{0, 1, 1}, {1, 1, 0}, {1, 1, 0}};
        System.out.println(minimumObstacles(grid));

        int[][] grid2 = {{0,1,0,0,0},{0,1,0,1,0},{0,0,0,1,0}};
        System.out.println(minimumObstacles(grid2));

        int[][] grid3 = {{0,1,1,1,0}};
        System.out.println(minimumObstacles(grid3));
    }
}
