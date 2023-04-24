import java.util.*;
public class subarrays {
    public static int subarray(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            int sum =0;
         
            int start = i;
            for(int j=i;j<numbers.length;j++){
              
                int end = j;
                System.out.print("[");
                for(int k= start;k<=end;k++){
                    System.out.print(numbers[k] + " ");
                  sum += numbers[k];
                }
                System.out.print("]");
                System.out.print("sum =" + sum);
                if(largest < sum)
                {
                    largest = sum;
                }
                if(smallest > sum)
                {
                    smallest = sum;
                }
                sum =0;
                System.out.println();
            }System.out.println();
        }
        System.out.println("largest sum of array ="+ largest);
        System.out.println("smallest sum of array ="+ smallest);
        return 0;
    }
    public static void main(String[] args){
        int numbers[] = {2,4,3,5};
        subarray(numbers);
    }
}
