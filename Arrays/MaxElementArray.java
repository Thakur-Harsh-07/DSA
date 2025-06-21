package Arrays;

public class MaxElementArray {
    public static void main(String[] args) {
        int[] arr = {-10,-8,-12,-4,-6,-23,-8};
        //int max = arr[0];
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           // if(mx<arr[i]) mx = arr[i];
            mx = Math.max(mx,arr[i]);
        }
        System.out.println(mx);
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]) min = arr[i];
        }
        System.out.println(min);
    }
}
