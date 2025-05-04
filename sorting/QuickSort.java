public class QuickSort {
  public static void quickSort(int arr[], int low, int high) {
    if (low < high) {
      int pi = partition(arr, low, high);
      quickSort(arr, low, pi - 1);
      quickSort(arr, pi + 1, high);
    }
  }

  public int partition(int arr[], int start, int end){
    int pivot = arr[end];
    int i = start - 1;
    int j;
    for(j = start; j<end; j++){
      if(arr[j]<=pivot){
        i++;
        //swap
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
  }
}
