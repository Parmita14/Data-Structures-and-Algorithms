import java.util.*;
public class SmallestNLargest {
    public static int FindSNL(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i =0 ; i<numbers.length;i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            
        } System.out.println("THE SMALLEST NUMBER :" + smallest);
        return largest;
    }
    
    public static void main(String[] args){
        int numbers[] = { 1,4,3,6,2,8};
        int largest = FindSNL(numbers);
        System.out.println("THE LARGEST NUMBER :" + largest );
    }
    }

