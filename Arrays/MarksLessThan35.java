package Arrays;

public class MarksLessThan35 {
    public static void main(String[] args) {
        int[] arr = {30,33,45,67,78,89,12,99,23,33};
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<35) System.out.print(i+" ");
        }
    }
}
