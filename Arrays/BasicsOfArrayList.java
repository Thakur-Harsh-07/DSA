package Arrays;

import java.util.ArrayList;

public class BasicsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0,10); // initialize
        arr.add(1,30);
        System.out.println(arr.get(0)); // get value
        arr.add(39);
        arr.add(56);
        System.out.println(arr);
        arr.set(1,34); // Modify
        System.out.println(arr);
        System.out.println(arr.size()); // size of ArrayList
        arr.remove(2);
        System.out.println(arr);
        System.out.println(arr.size());
        arr.remove(1);
        System.out.println(arr);
    }
}
