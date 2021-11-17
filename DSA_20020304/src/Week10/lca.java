package Week10;

public class lca {
    public class Node {
        int data;
        Node right;
        Node left;
    }
    public static Node lca(Node root, int v1, int v2) {
        // Write your code here.
        if ( root == null ) {
            return null;
        } else {
            if( root.data > v1 && root.data > v2) {
                root.left = lca(root.left, v1,v2);
                return root.left;
            } else if ( root.data < v1 && root.data <v2) {
                root.right = lca(root.right, v1,v2);
                return root.right;
            }
            return root;
        }
    }
}
