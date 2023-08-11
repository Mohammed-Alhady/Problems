class Solution:
    def maxProfit(prices) -> int:
        if len(prices) == 0:
            return 0

        l = 0
        r = 1
        maxP = 0

        for _ in range(1, len(prices)):
            if (prices[r] < prices[l]):
                l = r
            else:
                profit = prices[r] - prices[l]
                if (profit > maxP):
                    maxP = profit
            r += 1
        return maxP


prices = [7, 1, 5, 3, 6, 4]
print(Solution.maxProfit(prices))

prices = [7, 6, 4, 3, 1]
print(Solution.maxProfit(prices))
