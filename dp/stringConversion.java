public class stringConversion {
    public static int conversion(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i = 0; i<n+1; i++){
            for(int j = 0; j<m+1; j++){
                dp[i][j] = -1;
            }
        }
        int res = lcs(s1, s2, n, m, dp);
        int insertion = n -res;
        int deletion = m - res;
        return insertion+deletion;
    }
    public static int lcs(String s1, String s2, int n, int m, int dp[][]){
        if(n == 0 || m==0){
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }

        if(s1.charAt(n-1) == s2.charAt(m-1)){//equal character
            return dp[n][m] = lcs(s1, s2, n-1, m-1, dp)+1;
        }else{
            int ans1 = lcs(s1, s2, n-1, m, dp);
            int ans2 = lcs(s1, s2, n, m-1, dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }
    public static void main(String[] args) {
        String s1 = "pear";
        String s2 = "sea";
        System.out.println(conversion(s1, s2));
        // System.out.println(lcs);
    }
}
