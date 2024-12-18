package letcode.L1475;

import java.util.Arrays;

public class Solution {

    public int[] finalPrices(int[] prices) {
        int n = prices.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (j > i & prices[i] >= prices[j]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return prices;
    }

    public static void main(String[] args) {
        int[] prices = {8, 7, 4, 2, 8, 1, 7, 7, 10, 1};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.finalPrices(prices))); // Output: [1,3,2,1,7,0,0,6,9,1]
    }
}
