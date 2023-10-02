import java.util.*;

public class DiagonalSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of matrix");
        int size = sc.nextInt();
        int arr[][] = new int[size][size];
        System.out.println("enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//         if (size % 2 == 0) {
//             int sum = 0;
//             for (int i = 0; i < arr.length; i++) {
//                 for (int j = 0; j < arr[0].length; j++) 

// {
//                     if (i == j || i + j == size - 1) {
//                         sum = sum + arr[i][j];
//                     }
//                 }
//             }
//              System.out.println("Sum is " + sum);
//         }
//         else{
//             int sum = 0;
//             int num = (size/2);
//             for (int i = 0; i < arr.length; i++) {
//                 for (int j = 0; j < arr[0].length; j++) 

// {
//                     if (i == j || i + j == size - 1) {
//                         sum = sum + arr[i][j];
//                     }
//                 }
//             }
//             //sum = sum - arr[num][num];
//             System.out.println("Sum is " + sum);

//         }
    int sum=0;
    for(int i= 0;i<arr.length;i++)
    { 
        sum += arr[i][i];
        if(i!=size-1-i)
        sum+=arr[i][size-1-i];
    }
    System.out.println(sum);
   }
}
