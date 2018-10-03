package leetorg4g;

import basicds.Node;

import java.util.HashSet;

public class DeleteDuplicatesLL {

    public Node deleteDuplicates(Node head) { // this method takes care whether the list is sorted or not
        if(head == null) return null;

        HashSet<Integer> hs= new HashSet<>();
        Node cur = head;
        while(cur.next!=null){
            if(hs.contains(cur.next.data)){
                cur.next = cur.next.next;
            }
            else{
                hs.add(cur.next.data );
                cur = cur.next;
            }
        }
        return hs.contains(head.data)?head.next:head;
    }

    //if the LL is sorted in O(1) space => time complexity is higher O(n^2) meh

    public static Node deleteDuplicates2(Node head) {
        Node ptr = head;
        while (ptr != null) {
            while (ptr.next != null && ptr.data  == ptr.next.data) {
                ptr.next = ptr.next.next;
            }
            ptr = ptr.next;
        }

        return head;
    }
    public static void main(String[] args) {

    }
}
