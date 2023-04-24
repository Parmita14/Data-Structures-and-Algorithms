public class LongestCommonSubsequence(Rec) {
    public static int lcs(String str1,String str2,int n, int m){
        if(n == 0 || m == 0){
            return 0;
        }
        if(str1.charAt(n-1) == str2.charAt(m-1)){ // same
            return lcs(str1, str2, n-1, m-1) +1;
        }else{
            int ans1 = lcs(str1, str2, n-1, m);
            int ans2 = lcs(str1, str2, n, m-1);
            return Math.max(ans1, ans2);
        }
    }
}