package src.LeetCode;

public class stockSell {

    public static int maxProfit(int[] arr) {

        int n= arr.length;
        int minSoFar=arr[0];
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            minSoFar=Math.min(minSoFar, arr[i]);
            maxProfit = Math.max((arr[i]-minSoFar),maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {1,33,4,66,8};
        int profit = maxProfit(arr);
        System.out.println(profit);
    }
}
