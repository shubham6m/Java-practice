public class maxSubarrayProduct {
  public int maxProduct(int[] nums) {
    int n = nums.length;
    int productMax = nums[0];
    int productMin = nums[0]; // Track the minimum product (important for negative numbers)
    int result = nums[0];

    for (int i = 1; i < n; i++) {
      if (nums[i] < 0) {
        // Swap max and min when encountering a negative number
        int temp = productMax;
        productMax = productMin;
        productMin = temp;
      }

      productMax = Math.max(nums[i], productMax * nums[i]);
      productMin = Math.min(nums[i], productMin * nums[i]);

      result = Math.max(result, productMax); // Update global maximum
    }
    return result;
  }

  public static void main(String[] args) {
    maxSubarrayProduct mp = new maxSubarrayProduct();
    int arr[] = { 2, 3, -2, 4 };
    System.out.println(mp.maxProduct(arr));
  }
}
