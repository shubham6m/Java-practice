import java.util.*;
public class mcm {
    public static int mcmm(int arr[], int i, int j, int dp[][]){
        if(i==j){
            return 0; 
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for(int k = i; k<=j-1; k++){
            int cost1 = mcmm(arr, i, k, dp);
            int cost2 = mcmm(arr, k+1, j, dp);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1+ cost2+ cost3;
            ans = Math.min(finalCost, ans);
        }
        return dp[i][j] = ans;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,3};
        int n = arr.length;
        int dp[][] = new int[n][n];
        for(int i =0; i<dp.length; i++){
            // for(int j =0; j<dp[0].length; j++){
            //     dp[i][j] = -1;
            // }
            Arrays.fill(dp[i], -1);
        }
        System.out.println(mcmm(arr, 1, n-1, dp));
    }
}
