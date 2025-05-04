public class kadaneAlgo {
  public int maxSubArray(int[] nums) {
    // using kadane's algorithm
    int currSum = nums[0];
    int maxSum = nums[0];

    for (int i = 1; i < nums.length; i++) {
      currSum = Math.max(currSum + nums[i], nums[i]);
      maxSum = Math.max(currSum, maxSum);
    }
    return maxSum;
  }

  public static void main(String[] args) {
    kadaneAlgo k = new kadaneAlgo();
    int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    System.out.println(k.maxSubArray(arr));
  }
}