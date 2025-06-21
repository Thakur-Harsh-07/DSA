package Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,8};
        int n= arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        int mul = 1;
        for(int i=0;i<n;i++){
            mul*=arr[i];
        }
        System.out.println(mul);

    }
}
