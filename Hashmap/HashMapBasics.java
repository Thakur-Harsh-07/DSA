package Hashmap;

import java.util.HashMap;

public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Harsh",60);
        map.put("Ashirwad",14);
        map.put("Shubham",63);
        System.out.println(map);
        map.put("Harsh",40);
        System.out.println(map);
        map.remove("Shubham");
        System.out.println(map);
        System.out.println(map.get("Harsh"));
        System.out.println(map.entrySet());
    }
}
