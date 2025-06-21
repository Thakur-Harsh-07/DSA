package Recursion;

import java.util.ArrayList;

public class Subsets {
    static ArrayList<String> arr = new ArrayList<>();
    public static void printSubset(int i, String s, String ans){
        if(i==s.length()){
            //System.out.print(ans+" ");
            arr.add(ans);
            return;
        }
        char ch = s.charAt(i);
        printSubset(i+1,s,ans+ch); // take
        printSubset(i+1,s,ans); // Not take
    }
    public static void main(String[] args) {
        String s = "abc";
        arr = new ArrayList<>(); // reset
        printSubset(0,s,"");
        System.out.println(arr);
    }
}
// if(n==0 || m==0) return 0;
//String a = text1.substring(0,n-1);
//String b = text2.substring(0,m-1);
//
//        if(text1.charAt(n-1)==text2.charAt(m-1))
//        return 1+longestCommonSubsequence(a,b);
//        else{
//                return Math.max(longestCommonSubsequence(text1,b),longestCommonSubsequence(a,text2));
//        }
