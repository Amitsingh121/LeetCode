
package src.LeetCode;

public class stockSell {

    public static int maxProfit(int[] arr) {

        /*
        logic: Track the minimum price so far and calculate max profit at each step.
        int n = arr.length;
        int minSoFar = arr[0];
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            minSoFar = Math.min(minSoFar, arr[i]);
            maxProfit = Math.max((arr[i] - minSoFar), maxProfit);
        }
        return maxProfit;
        */

        // Alternative method: Use two pointers (buy and sell) to find the best profit window.
        int buy = 0, sell = 1, maxProfit = 0;
        while (sell < arr.length) {
            if (arr[sell] > arr[buy]) {
                maxProfit = Math.max(maxProfit, arr[sell] - arr[buy]);
            } else {
                buy = sell;
            }
            sell++;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {1, 33, 4, 66, 8};
        int profit = maxProfit(arr);
        System.out.println(profit);
    }
}

