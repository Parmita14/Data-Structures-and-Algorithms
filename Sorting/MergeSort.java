public class MergeSort {
public static void mergeSorting(int arr[], int si, int ei){
    if(si>=ei){
        // base case
        return;
    }
    // kaam
    int mid = si +(ei -si)/2;
    mergeSorting(arr, si, mid);
    mergeSorting(arr, mid+1, ei);
    merge(arr,si,ei,mid);

}  
public static void merge(int arr[], int si, int ei, int mid){
    int temp[] = new int[ei-si +1];
    int i = si; // iterator for left
    int j = mid+1;// itr for right
    int k = 0; // to itr temp array
    while(i<= mid && j<=ei){
        if(arr[i] < arr[j]){
            temp[k] = arr[i];
            i++;k++;
        }else{
            temp[k] = arr[j];
            j++;k++;
        }
    }
    while(i<=mid){
        temp[k++] = arr[i++];
    }
    while(j<= ei){
        temp[k] = arr[j];
        j++;k++;
    }
   for(k=0,i=si;k<temp.length;k++,i++){
    arr[i] = temp[k];
   }
} 
public static void printArr(int arr[]){
   
    for(int j=0;j<arr.length;j++){
        System.out.print(arr[j] + " ");
    }
System.out.println();
} 
public static void main(String args[]){
    int arr[] = {5,4,3,2,1};
    mergeSorting(arr, 0, arr.length-1);
    printArr(arr);
}
}
