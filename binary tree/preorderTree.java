import java.util.*;
public class preorderTree {
//defination of node -> what nodes contains
    static class Node{
        int data;
        Node left;
        Node right;
//insert data in node 
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
//creation of binary tree
        static class BinaryTree{
            static int idx = -1;
            public static Node buildTree(int nodes[]){
                idx++;
            if(nodes[idx] == -1){
                return null;
            }
            //else create newNode
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
//preorder sequence order is returned
    public static void preorder(Node root){
        if(root == null){
        //    System.out.print(-1+ " ");
           return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
        return;
    }
//inorder sequence order is returned
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
        return;
    }
//postorder sequence is returned
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
        return;
    }
//levelorder traversal
    public static void levelorder(Node root){

    Queue<Node> q = new LinkedList<>();

    }    
}            
    public static void main(String[] args) {
        // int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int nodes[] = {1, 2, 4, 5, 3, 6, 8, 9, 4};
        BinaryTree tree = new BinaryTree(); 
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);

        // tree.preorder(root);
        // tree.inorder(root);
        tree.postorder(root);
    }
}

