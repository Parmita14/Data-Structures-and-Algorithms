public class IntersectionOfList {
    // tc O(n*m)
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

     public Node getIntersectionNode(Node head1,Node head2){
        while(head2 != null){
            Node temp  = head1;
            while(temp != null){
                if(temp == head2){
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
     }

    }
