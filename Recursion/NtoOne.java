package Recursion;

import java.util.Scanner;

public class NtoOne {
    public static void Nto1(int n){
        if(n==0) return;
        System.out.print(n+" ");
        Nto1(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        Nto1(n);
    }
}
