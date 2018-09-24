package dataStructures;

import java.util.LinkedList;

class StackUQ{ // Easy pop

    LinkedList<Integer> q1;
    LinkedList<Integer> q2;
    StackUQ(){
        q1=new LinkedList<>();
        q2= new LinkedList<>();

    }

    public void push(int ele){
        q2.add(ele);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        LinkedList<Integer> temp = q1;
        q1=q2;
        q2=temp;

    }
    public int pop(){
        if(!q1.isEmpty())
        return q1.remove();

        else{
            System.out.println("Underflow");
            return -1;
        }
    }
}


class StackUQ2{ //Easy push
    LinkedList<Integer> q1;
    LinkedList<Integer> q2;
    StackUQ2(){
        q1=new LinkedList<>();
        q2= new LinkedList<>();

    }


    public void push(int ele){
        q1.add(ele);
    }

    public int pop(){
        int res;
        if(!q1.isEmpty()){
            for(int i=0;i<q1.size()-1;i++){
                q2.add(q1.remove());
            }
            res = q1.remove();
        }
        else{
            res =-1;
            System.out.println("Underflow");
        }

        LinkedList<Integer> temp = q1;
        q1=q2;
        q2=temp;
        return res;
    }


}

public class StackUsingQueue {

    public static void main(String args[]){
        StackUQ s = new StackUQ();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        StackUQ s2 = new StackUQ();
        s2.push(10);
        s2.push(20);
        s2.push(30);
        s2.push(40);
        System.out.println(s2.pop());
        System.out.println(s2.pop());
        System.out.println(s2.pop());
    }
}
