public class Largestelement{
public static int max(int a[]){
    int largest = Integer.MIN_VALUE;
    for (int i=1; i<=a.length;i++){
        if (a[i]>largest){
            largest=a[i];
        }
    }
return largest;
}

public static void main(String args[]){
int arr[]={2,4,1,5};
System.out.println("Largest number is"+max(arr));
   }
}