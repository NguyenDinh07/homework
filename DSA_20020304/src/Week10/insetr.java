package Week10;

public class insetr {
    public static class Node {
        int data;
        Node left;
        Node right;
    }

    public static Node insert(Node root,int value) {
        if (root == null) {
            Node n = new Node();
            n.data = value;
            n.left = null;
            n.right = null;
        }
        if (root.data > value) {
            root.left = insert(root.left,value);
        } else if (root.data < value) {
            root.right = insert(root.right,value);
        } else {
            root.data = value;
        }
        return root;
    }
}
