import java.util.*;
public class ReverseStack {
    // brute approach - make a new stack store popped elem from given stack n return
    // TC O(n) + additional space complexity is used
    // this approach solves with TC O(n) n SC O(1)
    //Recursion
    public static void pushAtBottom(Stack<Integer> s,int data ){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
public static void Reverse_Stack(Stack<Integer> s){
    if(s.isEmpty()){
        return;
    }
    int top = s.pop();
    Reverse_Stack(s);
    pushAtBottom(s, top);
}
public  static void printStack(Stack<Integer> s){
    while(!s.isEmpty()){
        System.out.println(s.pop());
    }
}
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
       
        Reverse_Stack(s);
        printStack(s);
    }
}
