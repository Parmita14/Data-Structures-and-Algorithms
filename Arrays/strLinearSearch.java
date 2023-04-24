import java.util.*;
public class strLinearSearch {
     public static int linearSearch(String numbers[] , String key){
        for(int i = 0;i< numbers.length;i++){
            if(numbers[i] == key){
                return i;
           
            }
            }
         return -1;   
        }
        public static void main(String[] args){
            String key = "apple";
            String numbers[] = { "mango" , "apple" , "banana" , "pineapple"};
            int index = linearSearch(numbers, key);
            if(index == -1){
                System.out.println("NOT FOUND");
            }else{
                System.out.println("keys is found at " + index + " index of array");
    
            }
            
        }
    } 
    

