public class deleteNthfromEnd {
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


    public void deleteFromEnd(int n){
        // calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next;
        }
        // sz-n
        int i = 1;
        int FindN = sz-n;
        Node prev = head;
        while(i < FindN){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }
}
