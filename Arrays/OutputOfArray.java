package Arrays;

import java.util.Scanner;

public class OutputOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;
//        arr[5] = 60;
//        arr[6] = 70;
        // taking input-->Loop
        for(int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        //output
        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
