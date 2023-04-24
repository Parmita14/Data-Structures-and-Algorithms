import java.util.*;
public class NumToWord {
    public static void numtoword(int n){
             //base case
            if(n==0){
                return;
            }
           int lastd = n % 10;
           switch(lastd){
            case 0 :
            System.out.print("zero ");
            break;
            case 1 :
            System.out.print("one ");
            break;
            case 2 :
            System.out.print("two ");
            break;
            case 3 :
            System.out.print("three ");
           break;
            case 4 :
            System.out.print("four ");
           break;
            case 5 :
            System.out.print("five ");
           break;
            case 6 :
            System.out.print("six ");
           break;
            case 7 :
            System.out.print("seven ");
           break;
            case 8 :
            System.out.print("eight ");
           break;
            case 9 :
            System.out.print("nine ");
           break;
        }
           numtoword(n/10);
        
         String digits[] = {"zero","one","two","three","four","five","six","seven","eigth","nine"};
        if(n ==0){
            return;
        }
        int lastd = n%10;
         numtoword(n/10);
         System.out.print(digits[lastd] +" ");
        }
        public static void main(String args[]){
            numtoword(1947);
        }
    }
        // public static int length(String str){
            
        //    if(str.length() == 0){
        //     return 0;
        //    }
        //    return length(str.substring(1)) + 1;
        // }
        // public static void main(String args[]){
        //     String str = "apple";
        //     System.out.println(length(str));
        // }
        
        // }
        
        

