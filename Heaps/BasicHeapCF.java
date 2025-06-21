package Heaps;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class BasicHeapCF {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(2);
        System.out.println(pq);
        pq.add(10);
        System.out.println(pq);
        pq.add(1);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        pq.add(0);
        System.out.println(pq);
    }
}