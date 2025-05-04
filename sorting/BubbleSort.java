class BubbleSort {
  public static int[] bubbleSort(int arr[]) {
    int n = arr.length;
    // using two for loops
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    return arr;
  }

  // main function
  public static void main(String args[]) {
    int arr[] = { 6, 2, 9, 0, 1, 4 };

    System.out.println("before sorting : ");
    Main.print(arr);

    System.out.println();

    bubbleSort(arr);

    System.out.println("after sorting : ");
    Main.print(arr);
  }
}
