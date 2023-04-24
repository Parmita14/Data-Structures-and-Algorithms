package Recursion;

public class LastOccurence {
    public static int LOcc(int arr[], int key,int i){
            if(i == arr.length){
                return -1;
            }
         int isfound = LOcc(arr, key, i+1);
         if(isfound == -1 && arr[i] == key){
            return i;
         }
         return isfound;
        }
        public static void main(String args[]){
                 int arr[] = {1,2,8,4,5,8,7,9};
                     System.out.println( LOcc(arr,8, 0));
            }
}
