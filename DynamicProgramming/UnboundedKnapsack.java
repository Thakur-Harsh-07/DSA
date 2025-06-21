package DynamicProgramming;

public class UnboundedKnapsack {
    public static int profit(int i, int[] wt, int[] val, int c,int[][] dp){
        if(i==wt.length) return 0;
        if(dp[i][c]!=-1) return dp[i][c];
        int skip = profit(i+1,wt,val,c,dp);
        if(wt[i]>c) return dp[i][c]= skip;
        int pick = val[i] + profit(i,wt,val,c-wt[i],dp);
        return dp[i][c]= Math.max(pick,skip);
    }
    public static void main(String[] args) {
        int[] val = {5,3,9,16};
        int[] wt = {1,2,8,10};
        int c = 8;
        int n = wt.length;
        // i = 0 to n-1 | c = C to 0
        int[][] dp = new int[n][c+1];
//        for(int i=0;i<dp.length;i++){
//            for(int j=0;j<dp[0].length;j++){
//                int skip =(i>0) ? dp[i-1][j] : 0;
//                if(wt[i]>j) dp[i][j] = skip;
//                else {
//                    int pick = val[i];
//                    pick+=(i>0) ? dp[i-1][j-wt[i]] : 0;
//                    dp[i][j] = Math.max(pick, skip);
//                }
//
//            }
//        }
//        System.out.println(dp[n-1][c]);
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(profit(0,wt,val,c,dp));
    }
}


