package Recursion;

public class FirstOccurence {
    public static int fOcc(int arr[] , int key,int i) {
            if(i == arr.length){
                return -1;
            }
            if(arr[i] == key){
                return i;
            }
            return fOcc(arr, key, i+1);
        }
        public static void main(String args[]){
                int arr[] = {1,2,8,4,5};
                System.out.println( fOcc(arr,8, 0));
             }
}
