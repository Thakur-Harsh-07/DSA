package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int fibo(int n){
        if(n==0 || n==1) return n;
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("The "+n+" Fibonacci No is "+fibo(n));
    }
}
