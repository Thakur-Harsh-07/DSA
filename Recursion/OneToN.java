package Recursion;

import java.util.Scanner;

public class OneToN {
    public static void oneToN(int n){
        if(n==0) return;
        oneToN(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        oneToN(n);
    }
}
