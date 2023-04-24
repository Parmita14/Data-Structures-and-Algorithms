import java.util.*;
public class ReverseString {
    public static String Reverse_String(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder res = new StringBuilder("");
        while(!s.isEmpty()){
            res.append(s.pop());
        }
       return  res.toString();
     } 
     public static void main(String args[]){
        String str = "abc";
       String ans =  Reverse_String(str);
         System.out.println(ans);

     }
}
