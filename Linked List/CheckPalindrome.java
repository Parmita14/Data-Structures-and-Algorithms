public class CheckPalindrome {
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
    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // step 1 - mid
        Node midNode = findmid(head);

        // step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // step 3 - check left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    
}
