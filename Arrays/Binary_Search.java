public class Binary_Search {
    public static  int binarySearch(int number[], int key){
        int start = 0, end = number.length -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(number[mid] == key){
                return mid;
            }
            if(number[mid] <key){ // check 2nd half
                start = mid + 1;
            }
            if(number[mid] > key){//  check 1st half
            end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int number[] ={1,2,3,4,5,6,7,8};
        int key = 7;
        int index = binarySearch(number, key);
        System.out.println("the index is " + index );
    }
}
