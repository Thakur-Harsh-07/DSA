package LinkedList;

class Linkedlist{ // user defined data structure
    Node head;
    Node tail;
    int size;
    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head==null){
            head = tail=temp;
        }
        else{
            tail.next = temp;
            tail=temp;
        }
        size++;
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null){
            head = tail=temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insert(int idx, int val){
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtEnd(val);
            return;
        }
        if(idx>size){
            System.out.println("Invalid Index");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i=1;i<=idx-1;i++){
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;

    }
    int get(int idx) throws Error{
        if(idx==size-1) return tail.val;
        if(idx>=size || idx<0){
            throw new Error("Invalid Index");
        }
        Node temp = head;
        for (int i = 1; i <=idx ; i++) {
            temp = temp.next;
        }
        return temp.val;
    }


    
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}
public class ImplementationLl {

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.display();
        System.out.println(ll.size);
        ll.insertAtEnd(90);
        ll.display();
        System.out.println(ll.size);
        ll.insertAtHead(50);
        ll.display();
        System.out.println(ll.size);
        ll.insert(2,100);
        ll.display();
//        ll.insert(10,34);
//        ll.display();
        System.out.println(ll.get(3));
        System.out.println(ll.get(-1));
    }
}
