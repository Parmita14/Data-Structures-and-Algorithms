import java.util.*;
public class binomialCoefficient{
public static int factorial(int n){
    int fact = 1;
    for(int i =1 ;i <= n; i++){
        fact = fact * i;
    }
    return fact;
}
public static void main( String[] args){
    System.out.println("ENTER THE VALUE OF N and R");
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int R = sc.nextInt();
    int bincoeff;
    bincoeff = factorial(N)/ (factorial(R) * factorial(N-R));
    System.out.println("binomial coefficient = " + bincoeff);
}
}