package Recursion;

public class TillingProblem {
   // tilling problem
    public static int tillingproblem(int n){
        if(n==0|| n==1){
            return 1;
        }
        int vertical = tillingproblem(n-1);
        int horizontal = tillingproblem(n-2);
        int totalways = vertical + horizontal;
        return totalways;
    }
    public static void main(String args[]){
        System.out.println(tillingproblem(4));
    }
}
