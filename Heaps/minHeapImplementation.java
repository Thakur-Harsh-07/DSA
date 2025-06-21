package Heaps;
class MinHeap{
    private int[] arr;
    private int size;
    MinHeap(int capacity){
        arr = new int[capacity];
        size=0;
    }
    public void add(int num) throws Exception{
        if(size==arr.length){
            throw new Exception("Heap is Full");
        }
      arr[size++] = num;
      upheapify(size-1);
    }
    public void upheapify(int idx){
        if(idx==0) return;
        int p = (idx-1)/2;
        if(arr[idx]<arr[p]){
            swap(idx,p);
            upheapify(p);
        }
    }
    public void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int size(){
        return size;
    }
    public int  peek() throws Exception{
        if(size==0){
            throw new Exception("Heap is Empty");
        }
        return arr[0];
    }
    public int remove() throws Exception{
        if(size==0){
            throw new Exception("Heap is Empty");
        }
        int peek = arr[0];
        swap(0,size-1);
        size--;
        downHeapify(0);
        return peek;
    }
    public void downHeapify(int idx){
        if(idx>=size-1) return;
        int lc = 2*idx+1;
        int rc = 2*idx+2;
        int minIdx = idx;
        if(lc<size && arr[minIdx]>arr[lc]) minIdx = lc;
        if(rc<size && arr[minIdx]>arr[rc]) minIdx = rc;
        if(idx==minIdx) return;
        swap(idx,minIdx);
        downHeapify(minIdx);
    }

}
public class minHeapImplementation {
    public static void main(String[] args) throws Exception {
        MinHeap pq = new MinHeap(10);

        pq.add(1);
        pq.add(6);
        pq.add(2);
        System.out.println(pq.size());
        System.out.println(pq.peek());
        pq.add(0);
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());

    }
}
