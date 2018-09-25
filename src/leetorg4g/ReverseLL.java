package leetorg4g;

import basicds.Node;

public class ReverseLL {

    public Node reverseList(Node head) {
        if(head==null) return null;

        Node cur=head;
        Node prev=null;
        Node next;

        while(cur !=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }

        return prev;
    }

    public static void main(String[] args) {

    }
}
