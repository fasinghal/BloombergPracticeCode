package dataStructures;

import basicds.Node;

class BasicStack{
    Node top;
    BasicStack(){
        top=null;
    }

    public boolean push(int data){
        if(top == null){//empty stack
            top = new Node(data);
        }
        else {
            Node temp = new Node(data);
            temp.next = top;
            top = temp;
        }
        return true;
    }
    public int pop(){
            int val = peek();
            if(val!=-1) top = top.next;
            return val;
    }

    public boolean isEmpty(){
        return  top == null;
    }
    public int peek(){
        if(top ==null){
            System.out.println("Empty Stack");
            return -1;
        }
        else return top.data;
    }
}

public class BasicNodeStack {
    public static void main(String[] args) {
        BasicStack stack=new BasicStack();
        stack.pop();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
