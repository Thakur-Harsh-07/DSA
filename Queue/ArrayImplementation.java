package Queue;

public class ArrayImplementation {
    public static class Queue{
      int f = -1;
      int r = -1;
      int size = 0;
      int[] arr = new int[100];
      void add(int val){
          if(r==arr.length-1){
              System.out.println("Queue is Full");
              return;
          }
          if(f==-1){ // currently empty
              f=r=0;
              arr[0] = val;
          }
          else{
              arr[++r] = val;
          }
          size++;
      }
      int remove(){
          if(size==0){
              System.out.println("Queue is empty");
              return -1;
          }
          int x = arr[f];
          f++;
          size--;
          return x;
      }
      int peek(){
          if(size==0){
              System.out.println("Queue is empty");
              return -1;
          }
          return arr[f];
      }
      void display(){
          if(size==0){
              System.out.println("Queue is empty");
          }
          else{
              for(int i=f;i<=r;i++){
                  System.out.print(arr[i]+" ");
              }
          }
          System.out.println();
      }
      boolean isEmpty(){
          if(size==0) return true;
          else return false;
      }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println(q.peek());
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
}
