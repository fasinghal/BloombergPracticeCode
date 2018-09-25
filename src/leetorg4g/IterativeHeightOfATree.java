package leetorg4g;

import java.util.LinkedList;
import java.util.Queue;

public class IterativeHeightOfATree {

    static class BinaryTree {
        private int data;
        private BinaryTree left, right;

        public BinaryTree(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public BinaryTree getLeft() {
            return left;
        }

        public void setLeft(BinaryTree left) {
            this.left = left;
        }

        public BinaryTree getRight() {
            return right;
        }

        public void setRight(BinaryTree right) {
            this.right = right;
        }

    }

    public static void main(String[] args) {
        final BinaryTree root = new BinaryTree(1);
        final BinaryTree l1 = new BinaryTree(2);
        final BinaryTree r1 = new BinaryTree(3);
        final BinaryTree ll2 = new BinaryTree(4);
        final BinaryTree lr2 = new BinaryTree(5);
        final BinaryTree rl2 = new BinaryTree(6);
        final BinaryTree rr2 = new BinaryTree(7);

        root.setLeft(l1);
        root.setRight(r1);
        l1.setLeft(ll2);
        l1.setRight(lr2);
        r1.setLeft(rl2);
        r1.setRight(rr2);

        final int heightOfTree = heightOfTree(root);

        System.out.println(heightOfTree);
    }

    private static int heightOfTree(BinaryTree root) {
        int heightOfTree = 0;

        if (root != null) {
            final Queue<BinaryTree> queue = new LinkedList<>();

            BinaryTree currentNode = root;
            queue.add(currentNode);

            while (!queue.isEmpty()) {
                int nodeCount = queue.size();

               // if (nodeCount == 0) {
               //     break;
               // } else {
                    heightOfTree = heightOfTree + 1;
               // }

                for (int count = 0; count < nodeCount; count++) {
                    currentNode = queue.remove();

                    if (currentNode.getLeft() != null) {
                        queue.add(currentNode.getLeft());
                    }
                    if (currentNode.getRight() != null) {
                        queue.add(currentNode.getRight());
                    }

                    /***
                     * For min height iterative check
                     *  if(node.left == null && node.right ==null)
                     *  if that is true and since we are traversing in BFS order
                     *  it means we have reached a leaf at a lower depth and this is
                     *  first such leaf. There we return current height +1
                     */
                }
            }
        }

        return heightOfTree;
    }

}