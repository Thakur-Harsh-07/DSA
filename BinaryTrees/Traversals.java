package BinaryTrees;

public class Traversals {
    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args) {
        Node a = new Node(1); // a is the root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;

        System.out.print("Preorder: ");
        preOrder(a);
        System.out.println();
        System.out.print("InOrder: ");
        inOrder(a);
        System.out.println();
        System.out.print("PostOrder: ");
        postOrder(a);
    }
}
