package SlidingWindow;

public class MaxSumSubarraySizeK {
    public static void main(String[] args) {
        int[] arr = {100,200,300,400};
        int k = 4;
        int n = arr.length;
//        int maxSum=0;
//        for(int i=0;i<n-k+1;i++){
//            int sum = 0;
//            for(int j=i;j<=i+k-1;j++){
//                sum+=arr[j];
//            }
//            maxSum = Math.max(maxSum,sum);
//        }
        int i=0,j=k-1,sum=0;
            for(int a=i;a<=j;a++){
                sum+=arr[a];
            }
            i++;
            j++;
            int maxSum = sum;
            while(j<n){
                sum = sum-arr[i-1]+arr[j];
                maxSum=Math.max(maxSum,sum);
                i++;
                j++;
            }

        System.out.println(maxSum);
    }
}
