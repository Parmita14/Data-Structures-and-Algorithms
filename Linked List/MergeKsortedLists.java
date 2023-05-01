public class MergeKsortedLists {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
     public static int size;
    public static Node SortedMerge(Node a, Node b){
        Node result = null;
        if(a == null)return b;
       else if(b == null)return a;
        if(a.data <= b.data){
            result = a;
            result.next = SortedMerge(a.next, b);
        }else{
            result = b;
            result.next = SortedMerge(a, b.next);
        }
        return result;
    }
    public static Node mergeKLists(Node arr[], int last){
        while(last != 0){
            int i=0,j = last;
            while(i<j){
                arr[i] = SortedMerge(arr[i], arr[j]);
                i++;
                j--;
                if(i >= j)last = j;
            }
        }
        return arr[0];
    }
}




















