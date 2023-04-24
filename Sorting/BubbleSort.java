public class BubbleSort {
   public static void bubble(int arr[]){
    for(int i = 0;i<arr.length;i++){
        for(int j=0;j<arr.length-1-i;j++){
             //swaping
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }  
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
bubble(arr);
} 
}
