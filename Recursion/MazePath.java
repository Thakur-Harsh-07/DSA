package Recursion;

import java.util.Scanner;

public class MazePath {
    public static int maze(int sr, int sc, int er, int ec) {
        if(sr==er || sc ==ec) return 1;
        int rightWays = maze(sr,sc+1,er,ec);
        int downWays = maze(sr+1,sc,er,ec);
        int totalWays = rightWays+downWays;
        return totalWays;
    }
    public static int maze2(int m, int n) {
        if(m==1 || n ==1) return 1;
        int rightWays = maze2(m,n-1);
        int downWays = maze2(m-1,n);
        int totalWays = rightWays+downWays;
        return totalWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.print("Enter m:");
        int m = sc.nextInt();
        System.out.println("Total No of ways "+maze(1,1,m,n));
        System.out.println(maze2(m,n));
    }

}
