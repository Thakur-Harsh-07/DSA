package BasicSorting;

public class InsertionSort {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr ={10,-4,20,4,8};
        int n = arr.length;
        print(arr);
        // Insertion Sort
        for(int i=1;i<n;i++){
            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
            }
        }
        print(arr);
    }
}
