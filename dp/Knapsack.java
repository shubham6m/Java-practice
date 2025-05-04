public class Knapsack {
    public static int knap(int val[], int wt[], int W, int n){
        if(W == 0 || n == 0){
            return 0;
        }
        //as weight is stored at one previous index e.g. for item 1 wt is at index 0 
        if(wt[n-1] <= W){//valid
            //include
            int ans1 = val[n-1] + knap(val, wt, W-wt[n-1], n-1);
            //exclude(not include)
            int ans2 = knap(val, wt, W, n-1);
            return Math.max(ans1, ans2);
        }else{//not valid
           return knap(val, wt, W, n-1);
        }
    }


    //target sum subset code
    public static boolean target(int arr[], int sum){
        int n = arr.length;
        boolean dp[][] = new boolean[n+1][sum+1];
        //when items = 0, then sum is always false
        //if sum is 0 then item's value always true
        // i = items , j= target sum
        for(int i =0; i<n+1; i++){
            dp[i][0] = true;
        }
        //here i =1 bcz 1st col is already filled above
        for(int i = 1; i<n+1; i++){
            for(int j = 1; j<sum+1; j++){
                // int v = arr[i-1];
                //include
                if(arr[i-1] <= j && dp[i-1][j-arr[i-1]] == true){
                    dp[i][j] = true;
                }
                //exclude
                else if(dp[i-1][j] == true){
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        // int val[] = {15, 14, 10, 45, 30};
        // int wt[] = {2, 5, 1, 3, 4};
        // int W = 7;
        // n = number of items 
    //    System.out.println(knap(val, wt, W, val.length));
        int arr[] = {4, 2, 1, 7, 3};
        int total = 18;
        System.out.println(target(arr, total));

    }
}
