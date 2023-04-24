import java.util.*;
// A set of parentheses are duplicate if the same subexpression is surrounded by multiple parentheses. 
// Stack TC O(n)
public class DuplicateParentheses {
    public static boolean isValidDup(String str){
    Stack<Character> s = new Stack<>();

    for(int i=0;i<str.length(); i++){
        char ch = str.charAt(i);
       // closing
        if(ch ==')'){
            int count = 0;
            while(s.peek() != '('){
                s.pop();
                count++;
            }
            if(count <1){
                return true; // duplicate exist
            }else{
                s.pop();  // opening pair
            }
        }else{
            // opening
            s.push(ch);
        }
    }
    return false;
}
    public static void main(String args[]){
        String str = "((a+b))"; // true
        String str2 = "(a-b)";  // false
        System.out.println(isValidDup(str));
    }
}
