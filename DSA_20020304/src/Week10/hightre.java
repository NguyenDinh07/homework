package Week10;
public class hightre {
    public class Node {
        int data;
        Node left;
        Node right;
    }
    public static int height(Node root) {
        // Write your code here.
        if(root == null) {
            return -1;
        } else {
            if(height(root.right) > height(root.left)) {
                return 1 + height(root.right);
            }   else {
                return 1 + height(root.left);
            }
        }
    }

}
