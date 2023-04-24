public class QuickSort {
public static void Quick(int arr[], int si, int ei){
    if(si>=ei){
        return;
    }
    // last element pivot
    int pidx = partition(arr,si,ei);
    Quick(arr, si, pidx-1);
    Quick(arr, pidx+1, ei);

}    
public static int partition(int arr[],int si, int ei){
    int pivot = arr[ei];
    int i = si-1; // to make elem smaller than pidx
    for(int j=si;j<ei;j++){
        if(arr[j] <= pivot){
            i++;
            // swap
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
    // To keep pivot at Proper index
    i++;
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;
    return i;
}
public static void printArr(int arr[]){
   
    for(int j=0;j<arr.length;j++){
        System.out.print(arr[j] + " ");
    }
System.out.println();
}
public static void main(String args[]){
    int arr[] = {5,4,3,6,1};
    Quick(arr, 0, arr.length-1);
    printArr(arr);
}
}
