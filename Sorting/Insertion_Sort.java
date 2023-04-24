public class Insertion_Sort {
    public static void Insert(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev] > curr){
            arr[prev+1] = arr[prev];
            prev--;
            }
            arr[prev+1] = curr;
        }
        printArr(arr);
    }
    public static void printArr(int arr[]){
   
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j] + " ");
        }
    System.out.println();
}
public static void main(String args[]){
int arr[] = {5,4,3,2,1};
Insert(arr);
}    
}
