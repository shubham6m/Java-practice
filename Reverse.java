public class Reverse{
public static void reverse(int arr[]){
    int first = 0, last = arr.length-1;
    while(first<last){
        //swap of two number
        int temp = arr[last];
        arr[last] = arr[first];
        arr[first] = temp;

        first++;
        last--;
    }
    for(int i=0;i<=arr.length;i++){
    System.out.println(arr[i]);
    }
        }
public static void main(String args[]){
int arr[]={2,4,1,5};
reverse(arr);
//for(int i=0;i<=arr.length;i++)
//System.out.println(arr[i]);
   }
}