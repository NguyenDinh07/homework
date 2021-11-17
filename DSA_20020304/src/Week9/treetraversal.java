package Week9;

public class treetraversal {
    public static void preOrder(Node root) {
    if(root == null) return;
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
}
    public static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    postorder(node)
    if node = null return
    postorder(node.left)
    postorder(node.right)
    print node
}
