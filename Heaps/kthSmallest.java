package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallest {
    public static void main(String[] args) {
        int[] arr = {10,2,8,3,-6,-2,-9,-12};
        int k =4;
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }

        System.out.println(pq.peek());
    }
}
