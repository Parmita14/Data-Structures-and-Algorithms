
public class CountSort {
    public static void count_sort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        int freq[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        // sorting
        int j=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i] > 0){
                arr[j] = i;
                j++;
                freq[i]--;
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
int arr[] = {5,4,3,2,1};
count_sort(arr);

}    
}
