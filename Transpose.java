public class Transpose{
    public static void main(String args[]){
        int arr[][]={{1,1,3},{2,3,4}};
        System.out.println("Before transpose: ");
   
        print(arr);

        //for transpose
       int row = arr.length; 
       int col= arr[0].length;
       int transpose[][]= new int[col][row];
       for (int i=0;i<col;i++){
        for(int j=0;j<row;j++){
            transpose[i][j]=arr[j][i];
        }
       }
       System.out.println("After transpose: ");
       print(transpose);
    }
    public static void print(int arr[][]){
     for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }    
}