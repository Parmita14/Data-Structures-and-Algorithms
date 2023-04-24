import java.util.*;
public class linearSearch {
    public static int linear_Search(int numbers[] , int keys){
        for(int i = 0;i< numbers.length;i++){
            if(numbers[i] == keys){
                return i;
           
            }
            }
         return -1;   
        }
    
    public static void main(String[] args){
        System.out.println("ENTER THE VALUE OF KEY :");
        Scanner sc = new Scanner(System.in);
        int keys = sc.nextInt();
        int numbers[] = { 6, 7, 3, 5,9,8,};
        int index = linear_Search(numbers, keys);
        if(index == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("keys is found at " + index + " index of array");

        }
        
    }
}
