package BasicSorting;

public class InsertionSort {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr ={5,1,3,2};
        int n = arr.length;
//        int moves=0;
        print(arr);
        // Insertion Sort
        for(int i=1;i<n;i++){
            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1] = temp;
//                    moves++;
                }
                else break;
            }
        }
//        System.out.println(moves);
        print(arr);
    }
}
