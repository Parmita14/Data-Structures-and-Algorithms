public class Merge {
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

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node merge(Node head1, Node head2){
        Node mergedll = new Node(-1);
        Node temp = mergedll;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedll.next;
    }

    public Node MergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }

        // find mid
        Node mid = getmid(head);
        // left & right if linked list
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = MergeSort(head);
        Node newRight = MergeSort(rightHead);

        // merge
        return merge(head, rightHead);
    }

}
