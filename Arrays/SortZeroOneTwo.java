package Arrays;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {0,0,1,2,1,2,0,1};
        int n = arr.length;
        // Method 1
//        int nOfZ = 0, noOfOne=0;
//        for(int i=0;i<n;i++){
//            if(arr[i]==0) nOfZ++;
//            else if(arr[i]==1) noOfOne++;
//        }
//        for(int i=0;i<n;i++){
//            if(i<nOfZ)  arr[i]=0;
//            else if(i<nOfZ+noOfOne) arr[i]=1;
//            else arr[i]=2;
//        }
        // Method 2 : dutch Flag Algorithm;
        int mid =0, hi = n-1, lo = 0;
        while(mid<=hi){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                lo++; mid++;
            }
            else if(arr[mid]==1) mid++;
            else{
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
