package leetorg4g;

import basicds.TreeNode;

import java.util.LinkedList;


public class MinMaxHeightOfATree {

    public static int getMaxMinHeightRecursive(TreeNode node){

        if(node==null && node.isLeaf()) return 0;
        else return Math.max(getMaxMinHeightRecursive(node.left)+1, getMaxMinHeightRecursive(node.right)+1);
    }

    public static int getMaxMinHeightIterative(TreeNode root){
        if(root ==null) return 0;
        int h=0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode curr = root;
        queue.add(curr);

        while(!queue.isEmpty()){
            int qSize = queue.size();
            h++;
            for(int i=0;i<qSize;i++){
                curr=queue.remove();
                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);
            }
        }
        return h;
    }
}
