public class tries {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i = 0; i<26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    //insert
    public static void insert(String str){
        Node curr = root;
        for(int level = 0; level<str.length(); level++){
            int idx = str.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    //search
    public static boolean search(String key){
        Node curr = root;
        for(int level = 0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow == true;
    }
    //count nodes
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        String s = "cac";
        for (int i = 0; i < s.length(); i++) {
            insert(s.substring(i)); // Insert each suffix into the trie
        }
        // used to find uniqu substring
        System.out.println(countNodes(root)-1);
    }
}

