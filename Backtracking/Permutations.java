import java.util.*;
public class permut{
   public static void findPermutations(String str, String ans){
        // base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        // recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            // "abcde" = ab + de -> to remove c
           String newstr = str.substring(0, i) + str.substring(i+1);
            findPermutations(str, ans+curr);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        findPermutations(str, "");
    }
}

