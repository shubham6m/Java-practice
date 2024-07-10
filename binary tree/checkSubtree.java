//this program will return false if subtree not exist & return true if exist
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;
public class checkSubtree{
   static class Node{
        int data;
        Node left, right;

         Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
// to check identical condition
public static boolean isIdentical(Node root, Node subRoot){
    if(root== null && subRoot == null){
        return true; 
    }else if(root == null || subRoot == null || root.data != subRoot.data){
        return false;
    }

    if(!isIdentical(root.left, subRoot)){
        return false;
    }
    if(!isIdentical(root.right, subRoot)){
        return false;
    }
    return true;
}
//to check existence
public static boolean isSubtree(Node root, Node subRoot){
    if(root == null){ //bcz subRoot cannot null root shouldn't be
        return false;
    }
    if(root.data == subRoot.data){
        if(isIdentical(root, subRoot)){
            return true;
        }
    }

    // boolean leftAns = isSubtree(root.left, subRoot);
    // boolean rightAns = isSubtree(root.right, subRoot);

    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
}
//print elements at kth level
public static void kLevel(Node root, int level, int k){
    if(root == null){
        return;
    }
    if (level == k){
        System.out.print(root.data + " ");
    }

    kLevel(root.left, level+1, k);
    kLevel(root.right, level+1, k);
}
    public static void main(String[] args) {
        //main tree
        /*
                              1
                            /   \
                           2     3
                          / \   / \
                         4   5 6   7
                                       */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //subtree
        /*
                     2
                   /   \
                  4     5  
         
         */
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        // System.out.println(isSubtree(root, subRoot));

        kLevel(root, 1, 3);
    }
}