package AdvancedSorting;

public class MergeSort {
    public static void merge(int[] a, int[] b, int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++]=a[i++];
            else c[k++] = b[j++];
        }
        while(j<b.length) c[k++] = b[j++];
        while(i<a.length) c[k++] = a[i++];
    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        // create two array of n/2 size each
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        // copy pasting
        for(int i=0;i<n/2;i++){
            a[i] = arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i] = arr[i+n/2];
        }
        // magic
        mergeSort(a);
        mergeSort(b);
        // merge these a and b
        merge(a,b,arr);

    }
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr ={10,40,60,70,30,20,80,50};
        print(arr);
        mergeSort(arr);
        print(arr);
    }


}
