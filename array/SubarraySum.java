public class SubarraySum {
  public static int countOddSumSubarrays(int[] nums) {
      int n = nums.length;
      int count = 0;
      int oddCount = 0;
      int evenCount = 1; // There is initially one even count (sum = 0)

      int prefixSum = 0;

      for (int i = 0; i < n; i++) {
          prefixSum += nums[i];

          // Check if the current prefix sum is odd or even
          if (prefixSum % 2 == 0) {
              count += oddCount;
              evenCount++;
          } else {
              count += evenCount;
              oddCount++;
          }
      }

      return count;
  }

  public static void main(String[] args) {
      int[] nums = {1, 2, 3, 4, 5, 6, 7};
      System.out.println("Number of subarrays with odd sums: " + countOddSumSubarrays(nums));
  }
}
