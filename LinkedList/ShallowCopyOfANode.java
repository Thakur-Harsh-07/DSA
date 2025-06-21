package LinkedList;

public class ShallowCopyOfANode {
//    public static class Node{
//        int val;
//        LinkedList.Node next;
//        Node(int val){
//            this.val=val;
//        }
//    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next =b; // linking a->b = 10->20
        b.next = c; // 10->20->30
        c.next = d; // 10->20->30->40
        d.next = e; // 10->20->30->40->50
        Node temp = a;// shallow copy of a
        // Node temp = new Node(100);// Deep Copy
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }

    }
}
