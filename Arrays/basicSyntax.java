package Arrays;

public class basicSyntax {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // initialising individuals element
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println(arr[0]);
        // update value;
        arr[0] = 29;
        arr[0]+=1;
        System.out.println(arr[0]);
    }
}
