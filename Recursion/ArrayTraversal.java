package Recursion;

public class ArrayTraversal {
    public static void printRec( int i,int[] arr){
        int n = arr.length;
        if(i==n) return;
        System.out.print(arr[i]+" ");
        printRec(i+1,arr);
    }
    public static void main(String[] args) {
        int[] arr ={1,4,7,9,3,5};
        printRec(0,arr);
    }
}
