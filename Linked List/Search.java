import java.util.*;
public class Search{
   public static class Node{
        int data;
        Node next;
        public Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
 
    public int iterative(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
        }

         public static void main(String args[]){
        LinkedList ll = new LinkedList<>();
        ll.head = new Node(2);
        ll.head.next = new Node(1);
    }
}