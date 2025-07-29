//print out the sum of numbers in second row of the array
public class SecondRow{
    public static int sum(int arr[][]){
        int Sum=0;
        for(int i= 0;i<arr.length;i++){
            Sum+= arr[1][i];
        }
        System.out.println("sum of numbers in second row is "+ Sum);
        return Sum;
    }
public static void main(String args[]){
    int arr[][]= {{1,4,9},{11,4,5},{1,5,8}};
    sum(arr);

        }
}