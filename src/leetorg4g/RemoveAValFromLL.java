package leetorg4g;

import basicds.Node;

public class RemoveAValFromLL {

    public static Node removeValueLinkedList(Node head, int val){
        Node pointer = head;
        if(head==null) return null;
        while(pointer.next!=null){
            if(pointer.next.data == val) pointer.next = pointer.next.next;
            else pointer = pointer.next;
        }

        return head.data == val ? head.next:head;


    }
    public static void main(String[] args) {

    }
}
