package Hashmap;

import java.util.HashMap;

public class ItrateMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Harsh",60);
        map.put("Ashirwad",14);
        map.put("Shubham",63);
        for(String key : map.keySet()){
            int val = map.get(key);
            System.out.println(key+" "+val);
        }
        System.out.println();
        for(int val : map.values()){
            System.out.println(val);
        }
        System.out.println();
        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }
    }
}
