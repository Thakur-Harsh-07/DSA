package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target element");
        int x = sc.nextInt();
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array  element");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        // solution
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                flag =true; // found
                break;
            }
        }
        if(flag==true) System.out.println("Element found");
        else System.out.println("Element not found");

    }
}
