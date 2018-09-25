package leetorg4g;
import basicds.Node;

import java.util.Stack;

public class PalindromeLL {

    public static boolean isPalindromeLL(Node head){ //takes Space O(N)
        if(head==null) return false;

        Stack<Node> stk = new Stack<>();
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            stk.push(slow);
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null) slow=slow.next;

        while(slow!=null){
            if(stk.pop().data!=slow.data) return false;
            slow=slow.next;
        }
        return true;
    }

    public static boolean isPalindromeLLNoExtraSpace(Node head){

        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null) slow=slow.next;

        ReverseLL reverseLL = new ReverseLL();
        Node head2 = reverseLL.reverseList(slow);

        Node head1=head;
        while(head2!=null){
            if(head2.data!=head1.data) return false;
            head1=head1.next;
            head2=head2.next;
        }
        return true;

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(1);
        Node d = new Node(1);
        head.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(isPalindromeLL(head));

        System.out.println(isPalindromeLLNoExtraSpace(head));
    }
}
