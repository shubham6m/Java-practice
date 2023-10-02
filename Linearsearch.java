//linear search 
public class Linearsearch {
   public static int linearsearch(int arr[], int key) {
      for (int i = 0; i <= arr.length; i++) 
         if (arr[i] == key) 
            return i;
         else 
             return -1;
}

   public static void main(String args[]){
      int arr[]= {10, 20, 30 , 40, 50, 60};
      int key = 40; 
      int index = linearsearch(arr, key);
      if(index == -1){
         System.out.println("element not found");
      }
      else {
         System.out.println("element found at index:"+index);
      }
   }
}
