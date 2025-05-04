public class lcs {
    public static int longestCommonSubstring(String s1, String s2, int n, int m, int dp[][]){
        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        if(s1.charAt(n-1) == s2.charAt(m-1)){//same character
            return dp[n][m] = longestCommonSubstring(s1, s2, n-1, m-1, dp)+1;
        }else{//diff character
            int ans1 = longestCommonSubstring(s1, s2, n-1, m, dp);
            int ans2 = longestCommonSubstring(s1, s2, n, m-1, dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }
        // public static void print(int dp[][]){
        //     for(int i = 0; i<dp.length; i++){
        //         for(int j = 0; j<dp[0].length; j++){
        //             System.out.print(dp[i][j] + " ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "acdg";
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i = 0; i<n+1; i++){
            for(int j = 0; j<m+1; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(longestCommonSubstring(s1, s2, n, m, dp));
        // print(dp);
    }
}
