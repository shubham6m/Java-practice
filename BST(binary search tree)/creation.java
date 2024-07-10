import java.util.*;
// this is used for create a bst
public class creation {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    //create a bst
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
                //left subtree
            root.left = insert(root.left, val);
        }else{ //right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    //find inorder of tree
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //searchig in bst
    public static boolean search(Node root, int val){
        if(root == null){
            return false;
        }
        if(root.data == val){
            return true;
        }
        if(root.data > val){
           return search(root.left, val);
        }else{
            return search(root.right, val);
        }
    }

    //delete a node
    public static Node delete(Node root, int val){
        if(root.data > val){
            root.left = delete(root.left, val);
        }else if(root.data < val){
            root.right = delete(root.right, val);
        }else{
            // case 1 : if any leaf node is present 
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2 : if there exist a single child of any node
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.right;
            }

            //case 3 : if both child are exist
            Node is = findInorder(root.right);
            root.data  = is.data;
           root.right =  delete(root.right, is.data);
        }
        return root;
    }

    //print in range : print all values of node within range given
    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data<k2){
            printInRange(root.left, k1, k2);
        }else{
            printInRange(root.right, k1, k2);
        }
    }
//inorder sequence
    public static Node findInorder(Node root){
        while(root.left == null){
            root = root.left;
        }
        return root;
    }

    //mirror a tree
    public static Node mirror(Node root){
        if(root == null){
            return null;
        }

        Node leftmirror = mirror(root.left);
        Node rightmirror = mirror(root.right);

        root.left = rightmirror;
        root.right = leftmirror;
        return root;
    }

    //create a balances BST from sorted array
    //or       create tree from inorder sequence
   public static Node createBst(int[] arr, int st, int end){
    if(st>end){
        return null;
    }
    int mid = (st + end)/2;
    Node root = new Node(arr[mid]);
    root.left = createBst(arr, st, mid-1);
    root.right = createBst(arr, mid+1, end);
    return root;
   }

   //inorder sequnce of a tree
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    //main function
    public static void main(String[] args) {
        int[] arr = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i =0; i<arr.length; i++){
            root = insert(root, arr[i]);
        }

        inorder(root);
        System.out.println();

        printInRange(root, 5, 12);
        // inorder(root);
        // System.out.println(search(root, 3));
        
        // if(search(root, 9)){
        //     System.out.println("key found");
        // }else{
        //     System.out.println("key not found");
        // }

        //create a bst 
        // Node root = new Node(8);
        // root.left = new Node(5);
        // root.right = new Node(10);
        // root.left.left = new Node(3);
        // root.left.right = new Node(6);
        // root.right.right = new Node(11);


        // root = mirror(root);
        // preorder(root);

    //     int[] arr = {3, 5, 6,8 ,10, 11, 12};
    //    Node root = createBst(arr, 0, arr.length-1);
    //     preorder(root); 
    }
}
