import java.util.*;
public class Delete2 {
    // Delete n nodes after m node in linked list
    // TC O(n)
    static void skipMdeleteN(Node head,int M, int N){
        Node curr = head,t;
        int count;

        while(curr != null){
            for(count = 1;count < M && curr != null;count++){
                curr = curr.next;
            }
            if(curr == null){
                return;
            }
        t = curr.next;
        for(count =1;count<=N && t!= null;count++){
            Node temp = t;
            t=t.next;
        }
        curr.next = t;
        curr = t;
        }

    }
}
