// import java.util.*;
public class catalanNo{
    //tablulation
    public static int countBST(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i = 2; i<n+1; i++){
            for(int j = 0; j<i; j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        print(dp);
        return dp[n];
    }
    public static void print(int dp[]){
        for(int i =0; i<dp.length; i++){
            System.out.print(dp[i] + " ");
        }
    }
    public static void main(String[] args) {
        int n = 6;
        // Arrays.fill(dp, -1);
        System.out.println(countBST(n));
    }
}
