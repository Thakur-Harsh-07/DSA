package Hashmap;

import java.util.HashSet;

public class Basics {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
       // System.out.println(set.size());
        set.add(-8);
        set.add(200);
        System.out.println(set);
        // search :  TC = O(1)
        System.out.println(set.contains(50));
        set.add(50);
        //System.out.println(set.contains(50));
        System.out.println(set.size());
        set.remove(100);
        System.out.println(set);

    }
}
