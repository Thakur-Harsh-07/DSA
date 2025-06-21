package Arrays;

public class PassingArrayToMethod {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] arr) {
        arr[0] = 9;
    }
}
