package Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void reverse(int[] arr,int i, int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] arr = {10,20,30,40,50,60,70};
       int n = arr.length;
       int k = sc.nextInt();
       k = k%n;
       reverse(arr,0,n-k-1);
       reverse(arr,n-k,n-1);
       reverse(arr,0,n-1);
       for(int ele : arr){
           System.out.print(ele +" ");
       }
    }
}
