public class heightTree {
    static class Node{
        int data;
         Node left;
         Node right;
         Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
         }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) + 1;
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node builTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = builTree(nodes);
            newNode.right = builTree(nodes);
            return newNode;
        }
    }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.builTree(nodes);
       System.out.println( height(root));;        
    }
}
