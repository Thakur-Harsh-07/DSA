package Arrays;



public class Sortzandone {
    public static void main(String[] args) {
        int[] arr = {0,0,1,0,1,0,1};
        int n = arr.length;
//        int noOfZero = 0;
//        int noOfOnes = 0;
//        for(int i=0;i<n;i++){
//            if(arr[i]==0) noOfZero++;
//            else noOfOnes++;
//        }
//        for(int i=0;i<n;i++){
//            if(i<noOfZero) arr[i] = 0;
//            else arr[i] = 1;
//        }
      int i=0;
      int j = n-1;
      while(i<j){
          if(arr[i]==0) i++;
          else if(arr[j]==1) j--;
          else if(arr[i]==1 && arr[j]==0){
              arr[i] = 0;
              arr[j] = 1;
              i++;
              j--;
          }
      }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
