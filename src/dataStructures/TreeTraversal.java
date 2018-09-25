package dataStructures;

import basicds.TreeNode;

import java.util.Stack;

public class TreeTraversal {
    TreeNode root;

    public static void inOrder(TreeNode n) {
        if (n == null) {
            return;
        }
        inOrder(n.left);
        System.out.print(n.data + " ");
        inOrder(n.right);
    }


    public static void preOrder(TreeNode n) {
        if (n == null) {
            return;
        }
        System.out.print(n.data + " ");
        preOrder(n.left);
        preOrder(n.right);
    }

    public static void postOrder(TreeNode n) {
        if (n == null) {
            return;
        }
        postOrder(n.left);
        postOrder(n.right);
        System.out.print(n.data + " ");
    }

    public static void inOrderIterative(TreeNode root) {

        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {

            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                TreeNode temp = stack.pop();
                System.out.print(temp.data + " ");
                curr = temp.right;
            }
        }
    }

    public static void preOrderIterative(TreeNode root) {
        //easiest
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            System.out.print(curr.data + " ");

            if (curr.right != null)
                stack.push(curr.right);

            if (curr.left != null)
                stack.push(curr.left);
        }
    }
    public static void postOrderIterative(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.peek();
            if(curr.isLeaf()){
                System.out.print(stack.pop().data+" ");
            }else{
                if(curr.right!=null){
                    stack.push(curr.right);
                    curr.right=null;
                }

                if(curr.left!=null){
                    stack.push(curr.left);
                    curr.left=null;
                }

            }
        }
    }
    public static void main(String[] args) {
        TreeTraversal traversal = new TreeTraversal();
        traversal.root = new TreeNode(10);
        traversal.root.left = new TreeNode(20);
        traversal.root.right = new TreeNode(30);

        inOrder(traversal.root);
        System.out.println("\nPre order recursive");
        preOrder(traversal.root);
        System.out.println();
        postOrder(traversal.root);
        System.out.println();

        System.out.println("PreOder Iterative");
        preOrderIterative(traversal.root);

        System.out.println("\nInOder Iterative");
        inOrderIterative(traversal.root);

        System.out.println("\nPostOrder Iterative");
        postOrderIterative(traversal.root);
    }
}
