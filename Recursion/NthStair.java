package Recursion;

import java.util.Scanner;

public class NthStair {
    public static int nthStair(int n){
        if(n==1 || n==2) return n;
        return nthStair(n-1) + nthStair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(nthStair(n));
    }
}
