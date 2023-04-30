public class FindMid {
    // slow-Fast approach

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

    public Node findmid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
