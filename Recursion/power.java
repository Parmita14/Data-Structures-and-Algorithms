package Recursion;

public class power {
  //  print x^n T.C O(n)
    public static int powr(int x, int n){
        if(n == 0){
            return 1;
        }
        int xnm1 = powr(x, n-1);
        int xn = x* xnm1;
        return xn;
    }
   
   // print x^n T.C O(logn)
    public static int power(int x,int n){
        if(n ==0){
            return 1;
        }
        int halfpower = powr(x, n/2);
    if(n % 2 != 0){
        int xn = x*halfpower*halfpower;
        return xn;
    }
    
        int xn = halfpower*halfpower;
    
    return xn;
    }
    public static void main(String args[]){
        System.out.println(powr(2, 5));
    }
}
