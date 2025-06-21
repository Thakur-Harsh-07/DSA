package Stacks;

public class LinkedListImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val= val;
        }
    }
    public static class llStack{
        Node head = null;
        int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;

        }
        int peek(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }
        void displayRev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        void displayRec(Node h){
            if(h==null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayRec(head);
            System.out.println();
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        llStack st = new llStack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
    }
}
