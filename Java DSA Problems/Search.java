//print number of 7's in 2-d array
public class Search{
    public static int search(int arr[][]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[][]={{4,3,7},{1,2,7}};
        int count = search(arr);
        System.out.print(count);
    }
}