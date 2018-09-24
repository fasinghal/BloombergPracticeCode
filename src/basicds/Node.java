package basicds;

public class Node {

    public int data;
    public Node next;

    public Node(){
        next = null;
    }

    public Node(int val){
        this.data=val;
        this.next = null;
    }
}
