// createSeg.java
//segment tree -> full binary treee
public class createSeg {//tc -> O(n)
    //create a tree variable
    static int tree[];
    //initialize tree
    public static void init(int n){
        tree = new int[4*n];
    }
    //build segment tree
    public static int create(int arr[], int i, int start, int end){
        if(start == end){
            tree[i] = arr[start];
            return arr[start];
        }
        int mid = (start + end)/2;

        create(arr, 2*i+1, start, mid);//for left subtree
        create(arr, 2*i+2, mid+1, end);//for right subtree
        tree[i] = tree[2*i+1] + tree[2*i+2];
        return tree[i];
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        init(n);
        create(arr, 0, 0, n-1);

        //print tree
        for(int i =0; i<tree.length; i++){
            System.out.print(tree[i] + " ");
        } 
    }
}