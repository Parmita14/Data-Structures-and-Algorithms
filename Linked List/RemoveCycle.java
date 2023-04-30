public class RemoveCycle {
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

     public static void removecycle(){
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false)return;

        // find Meeting point
        slow  = head;
        Node prev = null;
        while(slow != fast){
            prev  = fast;
            slow = slow.next;
            fast = fast.next;
        }
        
        // remove cycle - last.next = null
         prev.next = null;

     }
}
