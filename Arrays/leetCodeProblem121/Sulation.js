/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let l = 0, r = 1, maxP = 0;

    while (l < prices.length) {
        while(r < prices.length) {
            if(prices[r] < prices[l]) {
                l = r;
            } else {
                let profit = prices[r] - prices[l];
                if (profit > maxP) {
                    maxP = profit;
                }
            }
            r++;
        }
        return maxP;
    }
};

let prices = [7, 1, 5, 3, 6, 4]
console.log(maxProfit(prices))

prices = [7, 6, 4, 3, 1]
console.log(maxProfit(prices))