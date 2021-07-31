public class BinaryTree{
    int key;
    BinaryTree lc,rc;
    BinaryTree(int key,BinaryTree lc,BinaryTree rc)
    {
        this.key = key;
        this.rc  = rc;
        this.lc = lc;
    }
    static void printPostorder(BinaryTree node) 
    { 
        if (node == null) 
            return; 
  
        // first recur on left subtree 
        printPostorder(node.lc); 
  
        // then recur on right subtree 
        printPostorder(node.rc); 
  
        // now deal with the node 
        System.out.print(node.key + " "); 
    } 
    public static void main(String[] args){
        BinaryTree i = new BinaryTree(4,null,null);
        BinaryTree j = new BinaryTree(5,null,null);
        BinaryTree k = new BinaryTree(6,null,null);
        BinaryTree l = new BinaryTree(2,i,null);
        BinaryTree m = new BinaryTree(3,j,k);
        BinaryTree x = new BinaryTree(1,m,l);
        printPostorder(x);
    }
}