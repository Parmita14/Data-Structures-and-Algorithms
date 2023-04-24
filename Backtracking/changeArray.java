public class changeArray {
     // // changing array using recursion

      public static void changeArr(int arr[],int i,int val){
      // base case
      if(i==arr.length){
      printArr(arr);
      return;
      }
      // recursion
      arr[i] = val;
      changeArr(arr, i+1, val+1);
      arr[i] = arr[i]-2;
      }
}
