public class SelectionSort {
  public static int[] selectionSort(int arr[]) {
    int n = arr.length;
    // select the smallest element from array & swap with first element
    for (int i = 0; i < n - 1; i++) {
      int pos = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[pos] > arr[j]) {
          pos = j;
        }
        if (pos != i) {
          int temp = arr[i];
          arr[i] = arr[pos];
          arr[pos] = temp;
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
    
    selectionSort(arr);

    System.out.println("after sorting : ");
    Main.print(arr);
  }
}
