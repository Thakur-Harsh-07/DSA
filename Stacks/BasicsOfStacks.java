package Stacks;

//import java.util.Stack;
import java.util.*;

public class BasicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(90);
        st.push(5);
        //peek
        System.out.println(st.peek());
        //st.pop();
        System.out.println(st);
        System.out.println("Size is->"+st.size());
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
    }
}
