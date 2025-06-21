package BinaryTrees;

public class SumOfTreeNode {
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    public static int height(Node root){
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right))-1;
    }
    public static int level(Node root){
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public static int product(Node root){
        if(root==null) return 1;
        int x = root.val;
        return x*(product(root.left)*product(root.right));
    }
    public static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static int sum(Node root){
        if(root==null) return 0;
        int x = root.val;
        return x+(sum(root.left)+sum(root.right));
    }
    public static void main(String[] args) {
        Node a = new Node(1); // a is the root
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
//        System.out.println(sum(a));
//        System.out.println(product(a));
        System.out.println(max(a));
        System.out.println(size(a));
        System.out.println(level(a));
        System.out.println(height(a));
    }

}
