public class Sulation {
    public static int maxProfit(int[] prices) {
        // int index, minPrice, maxPrice;

        // minPrice = prices[0];
        // index = 0;
        // for (int i = 1; i < prices.length; i++) {
        // if (minPrice > prices[i]) {
        // minPrice = prices[i];
        // index = i;
        // }
        // }
        // if (index == prices.length - 1) {
        // return 0;
        // }

        // maxPrice = prices[index];
        // for (int i = index + 1; i < prices.length; i++) {
        // if (maxPrice < prices[i]) {
        // maxPrice = prices[i];
        // }
        // }

        // return maxPrice - minPrice;

        int l = 0, r = 1, maxP = 0;

        while (r < prices.length) {
            if (prices[r] < prices[l]) {
                l = r;
            } else {
                int profit = prices[r] - prices[l];
                if (profit > maxP) {
                    maxP = profit;
                }
            }
            r++;
        }
        return maxP;
    }
}
