package com.dsa.array;

public class BuyAndSellStock {

	public static void main(String[] args) {

		int prices[] = { 7,6,4,3,1 };
		int maxProfit = maxProfit(prices);
		System.out.println(maxProfit);

	}

	public static int maxProfit(int[] prices) {

		// initialization : minPrice to purchase 0st index
		int miniPrice = prices[0];
		int profit = 0;

		for(int i=1;i<prices.length;i++)
		{
			// cost of purchase and sell
			int cost = prices[i] - miniPrice;
			// calc profit
			profit = Math.max(cost,profit);
			// finding miniPrice
			miniPrice = Math.min(miniPrice,prices[i]);
		}

		return profit;
	}

}
