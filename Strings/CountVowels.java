package Strings;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='a' ||  ch =='e'|| ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println(count);

    }
}
