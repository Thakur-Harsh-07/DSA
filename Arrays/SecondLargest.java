package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,9,23,43};
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            // if(mx<arr[i]) mx = arr[i];
            mx = Math.max(mx,arr[i]);
        }
        int smx = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smx && arr[i]!=mx)   smx = arr[i];
            //if(arr[i]!=mx) smx = Math.max(smx,arr[i]);
        }
        System.out.println(smx);
    }
}
