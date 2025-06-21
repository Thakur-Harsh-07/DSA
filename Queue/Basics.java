package Queue;

//import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Basics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
      //  Queue<Integer> r = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        System.out.println(q.size());
        q.add(3);
        q.add(4);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.peek());
    }
}
