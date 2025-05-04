public class fibonacii {
    public static int fibo(int n){
        int dp[] = new int[n+1];
        dp[0] = 0;//in java this line is optional bcz by default value is zero
        dp[1] = 1;
        for(int i =2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String args[]){
        // fibonacii f = new fibonacii();
        System.out.println(fibo(5));
    }
}
