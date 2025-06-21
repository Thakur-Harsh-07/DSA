package Recursion;

import java.util.Scanner;

public class GenerateParantheses {
    public static void printParantheses(int open, int close, int n,String s){
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
        if(open<n) printParantheses(open+1,close,n,s+"(");
        if(close<open) printParantheses(open,close+1,n,s+")");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printParantheses(0,0,n,"");
    }
}
