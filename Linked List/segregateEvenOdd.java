public class segregateEvenOdd {
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


    public void EvenOdd(){
        Node end = head;
        Node prev = null;
        Node curr = head;

        while(end.next != null){
            end = end.next;
        }
        Node new_end = end;
        while(curr.data % 2!=0 && curr != end){
         new_end.next = curr;
         curr = curr.next;
         new_end.next.next = null;
         new_end = new_end.next;   
        }
     if(curr.data %2==0){
        head = curr;
        while(curr!=end){
            if(curr.data % 2 == 0){
                prev = curr;
                curr = curr.next;
            }else{
                prev.next = curr.next;
                curr.next = null;
                new_end.next = curr;
                new_end = curr;
                curr = prev.next;
            }
        }
     }   
     else{
        prev = curr;
     }
     if(new_end != end && end.data %2 != 0){
        prev.next = end.next;
        end.next = null;
        new_end.next = end;
     }
    }
}
