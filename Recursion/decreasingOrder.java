 public class decreasingOrder{
 public static void printdec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n +" ");
        printdec(n-1);
    }
    public static void main(String args[]){
        printdec(5);
    }
}