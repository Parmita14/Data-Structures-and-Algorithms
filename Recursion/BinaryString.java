package Recursion;

public class BinaryString {
    // binary string problem
// print all binary string of size n without consecutive ones

// all occurences
public static void occurence(int arr[] , int key , int i){
    // base case
    if(i == arr.length)
    {
        return;
    }
    // kaam
    if(arr[i] == key){
        System.out.print(i+" ");
    }
    occurence(arr, key, i+1);
}
public static void main(String args[]){
    int arr[] ={3,2,4,5,6,2,7,2,2};
    int key =2;
    occurence(arr, key, 0);
    
}
}
