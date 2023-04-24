import java.util.*;
public class ClimbingStairs {
    // memoization || recursion --> (2^n) --> n = 10^5
    public static int CountWays(int n, int ways[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n] != -1){ // Already calculated
            return ways[n];
        }
        ways[n] = CountWays(n-1, ways) + CountWays(n-2, ways);
        return ways[n];
    }
    public static int countwaysTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        // Tabulation loop
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i] = dp[i-1];
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }
           
        }
return dp[n];
    }
    public static void main(String args[]){
        int n = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println(CountWays(n, ways));
        System.out.println(countwaysTab(n));
    }
}
