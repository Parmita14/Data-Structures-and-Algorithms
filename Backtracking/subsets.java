public class subsets {
     public static void findsubset(String str,String ans , int i){
      // base case
      if(i == str.length()){
      System.out.println(ans);
      return;
      }
      // choice : yes
      findsubset(str, ans+str.charAt(i), i+1);
      // choice : no
      findsubset(str, ans, i+1);
      }
      // find permutations of string
      public static void findpermutation(String str,String ans){
      // base case
      if(str.length() == 0){
      System.out.println(ans);
      return;
      }
      // recursion
      for(int i=0;i<str.length();i++){
      char curr = str.charAt(i);
      //abcde = ab + de removed c
      String newstr = str.substring(0, i) + str.substring(i+1);
      findpermutation(newstr, ans+curr);
    }

}


}
