package Recursion;

public class DuplicateString {
    public static void removeDuplicate(String str ,int idx,StringBuilder newstr,boolean map[]){
            if(idx == str.length()){
                System.out.println(newstr);
                return;
            }
            char currchar = str.charAt(idx);
            if(map[currchar- 'a']== true){
                removeDuplicate(str, idx+1, newstr, map);
            }else{
                map[currchar -'a'] = true;
                removeDuplicate(str, idx+1, newstr.append(currchar), map);
            }
        }
        public static void main(String args[]){
            String str = "appnnacollege";
            removeDuplicate(str, 0, new stringBuilder(" "),new boolean[26]);
        }
}
