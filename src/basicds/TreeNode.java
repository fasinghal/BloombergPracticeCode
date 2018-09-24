package basicds;

public class TreeNode {

    public int data;
    public TreeNode left;
    public TreeNode right;
    TreeNode(int val){
        this.data=val;
        this.left=null;
        this.right=null;
    }

    public boolean isLeaf(){
        if(this.left==null && this.right ==null) return true;
        else return false;
    }
}
