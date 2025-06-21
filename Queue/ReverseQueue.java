package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
       int k=3;
        System.out.println(q);
        Stack<Integer> st = new Stack<>();
        for(int i=1;i<=k;i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        for(int i=1;i<=q.size()-k;i++){
            q.add(q.remove());
        }
//        while(q.size()>0){
//            st.push(q.remove());
//        }
//        while(st.size()>0){
//            q.add(st.pop());
//        }
        System.out.println(q);
    }
}
