
public class Subtree {
    // Question :function for checking if two trees are Identical
    public static boolean isIdentical(Node node,Node subRoot){
        if(node == null || subRoot == null){
            return true;
        }else if(node == null || SubRoot == null || node.data != subRoot.data){
            return false;
        }
        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }
        return true;
    }
 // Question :function for checking if two a tree is subtree of another tree
 public static boolean isSubtree(Node root, Node subRoot){
    if(root == null){
        return false;
    }
    if(root.data == subRoot.data){
        if(isIdentical(root, subRoot)){
            return true;
        }
    }
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    
 }
}
