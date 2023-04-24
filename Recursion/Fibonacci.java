

public class Fibonacci {
    public static int fibo(int n){
            if(n ==0 || n==1){
                return n;
            }
            int fibn = fibo(n-1) + fibo(n-2);
            return fibn;
        }
        public static void main(String args[]) {
            System.out.println(fibo(8));    
        }
}
