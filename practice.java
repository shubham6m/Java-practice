import java.util.*;

public class practice {

    public static void Sum(int arr[]){
        if ()
    }

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
    }
}