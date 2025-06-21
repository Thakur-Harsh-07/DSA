package DynamicProgramming;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {8,6,2,4};
        int n = arr.length;
        int target = 11;
        int[][] dp = new int[n][target+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(subSet(0,arr,target,dp));
    }

    private static boolean subSet(int i, int[] arr, int target,int[][] dp) {
        if(i==arr.length){
            if(target==0) return true;
            else return false;
        }
        if(dp[i][target]!=-1) return (dp[i][target]==1);
        boolean ans = false;
        boolean skip = subSet(i+1,arr,target,dp);
        if(target-arr[i]<0) ans= skip; // only valid for +ve number
        else{
            boolean pick = subSet(i+1,arr,target-arr[i],dp);
            ans = pick||skip;
        }
        if(ans) dp[i][target] = 1;
        else dp[i][target] = 0;
        return ans;
    }
}
