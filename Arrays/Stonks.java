package Arrays;

// Question
// Best Time to Buy and Sell Stock

// Day No:-         1 2 3 4 5 6
// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

class DriverStonks {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        // int[] arr = { 2, 4, 1 };
        new Stonks().maxProfit(arr);
    }
}

class Stonks {
    public void maxProfit(int[] arr) {

        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minprice)
                minprice = arr[i];
            else if (arr[i] - minprice > maxprofit)
                maxprofit = arr[i] - minprice;
        }
        System.out.println("The Max Profit is " + maxprofit);
    }
}
