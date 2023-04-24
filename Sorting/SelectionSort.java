public class SelectionSort {
    public static void Selection(int arr[]){
        int minpos = 0;
        for(int i=0;i<arr.length-1;i++){
             minpos = i;
             for(int j=i+1;j<arr.length;j++){
            if(arr[minpos] > arr[j]){
                minpos = j;
            }
     }
            // swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;

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
int arr[] = {4,3,2,1};
Selection(arr);
}    
}
