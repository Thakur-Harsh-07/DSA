package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class sortKSortedArray {
    public static void main(String[] args) {
        int[] arr = {6,5,3,2,8,10,9};
        int k = 3;
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                ans.add(pq.remove());
            }
        }
        while(pq.size()>0){
            ans.add(pq.remove());
        }
        System.out.println(ans);
    }
    public class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
          PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, Pair> map = new HashMap<>();

          for(int i=0;i<points.length;i++){
              int x = points[i][0], y = points[i][1];
              int d2 = x*x + y*y;
              pq.add(d2);
              Pair coordinate = new Pair(x,y);
              map.put(d2,coordinate);
              if(pq.size()>k) pq.remove();
          }
          int[][] ans = new int[k][2];
          for(int i=0;i<k;i++){
              int dist = pq.remove();
              Pair pt = map.get(dist);
              ans[i][0] = pt.x;
              ans[i][1] = pt.y;

          }
          return ans;
    }
}
