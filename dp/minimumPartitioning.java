import java.util.*;

public class minimumPartitioning {
    public static int mp(int arr[]) {
        int n = arr.length;
        int sum = 0;

        // Calculate the total sum of elements
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Size of the knapsack
        int w = sum / 2;

        // Create a DP array
        int dp[][] = new int[n + 1][w + 1];

        // Fill the DP array
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = Math.max(arr[i - 1] + dp[i - 1][j - arr[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // Calculate the partition difference
        int sum1 = dp[n][w];
        int sum2 = sum - sum1;
        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) {
        int arr1[] = { 3, 2, 5, 10 };
        System.out.println(mp(arr1));
    }
}
