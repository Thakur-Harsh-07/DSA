package BasicSorting;

public class BubbleSort {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       int[] arr ={5,1,3,4,2};
       int n = arr.length;
        System.out.println("Sakshi Tiwari");
        System.out.println("Original Array");
       print(arr);
       // bubble sort
//       for(int j =0;j<n-1;j++) { // n-1 passes
//           for (int i = 0; i < n -1-j; i++) {
//               if (arr[i] > arr[i + 1]) {
//                   int temp = arr[i];
//                   arr[i] = arr[i + 1];
//                   arr[i + 1] = temp;
//               }
//           }
//       }
        for(int j =0;j<n-1;j++) { // Optimize Bubble sort
            boolean flag = true;
            for (int i = 0; i < n -1-j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }
            if(flag==true) break;
        }
        System.out.println("Bubble Sort-->");
       print(arr);
    }
}
