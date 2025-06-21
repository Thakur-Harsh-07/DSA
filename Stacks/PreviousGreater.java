package Stacks;

import java.util.Stack;

public class PreviousGreater {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,75,85};
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        res[0] = -1;
        st.push(arr[0]);
        for(int i=1;i<n;i++){
            while(st.size()>0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size()==0) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        for (int i = 0; i <res.length ; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
