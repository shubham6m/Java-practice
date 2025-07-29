//remove duplicates element from a sorted array
class removeDuplicates{
    public static void remove(int arr[]){
     int i = 0;
            for(int j = 1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[j];
                    arr[j] = temp;
                    i++;
                }
            }
            System.out.print("Array after removing duplicates elements: ");
            for(int k=0; k<i+1; k++){
            System.out.print(arr[k] + " ");
            }
    }
    public static void main(String[] args) {
        int ar[] = {0,1,1,2,2,2,3,3,4};
        remove(ar);
    }
}