package LinkedList;

public class DisplayRec {
    public static void print(Node head){
        if(head==null) return;
       // print(head.next);
        System.out.print(head.val+" ");
        print(head.next);
    }
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
        print(a);
    }
}
