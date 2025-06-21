package Queue;

public class LlImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class queueLl{
        Node head = null;
        Node tail = null;
        int size;
        void add(int val){
            Node temp = new Node(val);
            if(size==0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
           size++;

        }
        int peek(){
            if(head==null){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }
        int remove(){
            if(head==null){
                System.out.println("Queue is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }
        void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        queueLl q = new queueLl();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println(q.peek());
        q.remove();
        q.display();
    }
}
