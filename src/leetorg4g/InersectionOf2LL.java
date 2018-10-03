package leetorg4g;

import basicds.Node;

public class InersectionOf2LL {

    public Node getIntersectionNode(Node headA, Node headB) {
        if(headA == null || headB == null) return null;

        Node a = headA;
        Node b = headB;

        //if a & b have different len, then stop the loop after second iteration (both become null)
        while( a != b){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }

        return a;
    }
}
