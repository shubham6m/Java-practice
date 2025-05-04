public class wildcardMatching {
    public static boolean isMatch(String s, String p){
        int n = s.length();
        int m = p.length();
        //create dp array
        boolean dp[][] = new boolean[n+1][m+1];
        //initialize 
        //s ="" && p = ""
        dp[0][0] = true;
        // print(dp);
        //p = ""
        for(int i = 1; i<n+1; i++){
            dp[i][0] = false;
        }
        //if last character of p is * then match remaining string of p with remaining string of s, i.e. 
        for(int j = 1; j<m+1; j++){
            if(p.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1];
            }
        }

        //for remaining cells
        for(int i = 1; i<n+1; i++){
            for(int j =1; j<m+1; j++){
                //ith character == jth character || jth character = "?"
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }
            //if p.charAt(j-1) = "*"
            //ignore * -> check for dp[i][j-1]
            //involve * with character of s -> check for dp[i-1][j] 
              else if(p.charAt(j-1) == '*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                    System.out.println(dp[i][j]);
                }else{
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }  
    public static void main(String[] args) {
        String s = "aa";
        String p = "*";
        System.out.println(isMatch(s, p));
    }
}
 