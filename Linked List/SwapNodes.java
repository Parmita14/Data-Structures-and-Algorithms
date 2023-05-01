public class SwapNodes {
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

     public void swap(int x,int y){
        if(x == y){
            return;
        }
        Node prevX = null,currX = head;
        while(currX != null && currX.data != x){
            prevX = currX;
            currX = currX.next;
        }
        Node prevY = null,currY = head;
        while(currY != null && currY.data != y){
            prevY = currY;
            currY = currY.next;
        }
        if(currX == null || currY == null)return;
        if(prevX != null){
            prevX.next = currY;
        }else{
            head = currY;
        }
        if(prevY != null){
            prevY.next = currX;
        }else{
            head = currX;
        }
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
     }
}
