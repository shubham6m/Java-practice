// height of tree- -> recursive approach to calculate height of tree 
// we use maximum of left/right + 1;

//same recursive appraoch used for calculate no. of nodes in tree
import java.math.*;
import java.util.*;
public class treeHeight {
    static class Node{
        int data;
        Node left, right;
   

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}    
 /*                          1
                           /   \
                          2     3
                        /  \   /  \
                       4   5  6    7
*/
//calculate height of tree
public static int height(Node root){
    if(root == null){
        return 0;
    }
    int lh = height(root.left);
    int rh = height(root.right);
    return Math.max(lh, rh) + 1;
}
//calculate no. of nodes of tree
public static int nodeCount(Node root){
    if(root == null){
        return 0;
    }

    int lcount = nodeCount(root.left);
    int rcount = nodeCount(root.right);
    return lcount + rcount + 1;
}

public static int sum(Node root){
    int sum = 0;
    if(root == null){
        return 0;
    }
    int lsum = sum(root.left);
    sum = sum + lsum;
    int rsum = sum(root.right);
    sum = sum + rsum;
    return sum + root.data;
}

//diamater of the tree 
public static int dia(Node root){
    if(root == null){
        return 0;
    }
    int ldia = dia(root.left);
    int rdia = dia(root.right);
    int lh = height(root.left);
    int rh = height(root.right);
    int self = lh + rh + 1;

    return Math.max(self, Math.max(ldia, rdia));
}
    public static void main(String[] args) {
        //create tree 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // root.left.left.left = new Node(8);
        
        //calculate height of tree
        System.out.println("height of tree is: " + height(root));

        //calculate no. of nodes in tree
        System.out.println("Number of nodes: "+ nodeCount(root));

        //calculate sum of nodes of tree
        System.out.println("sum of nodes is: "+ sum(root));

        //calculate diameter of tree 
        System.out.println("diameter of tree is: " + dia(root));
        }
    }
