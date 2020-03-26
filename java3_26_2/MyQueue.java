package java3_26_2;


import java.util.InputMismatchException;

class Node{
    int val;
    Node next;

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
    public Node(int val){
        this(val,null);
    }
}
//插入元素
public class MyQueue {
    private Node head=null;
    private Node tail=null;
    private int size=0;

    public void offer(int v){
        Node node=new Node (v);
        if(tail==null){
            head=node;
        }
        tail.next=node;
        tail.next=tail;
        size++;
    }
    //删除元素
    public Integer poll(){
        if(head==null){
            return null;
        }
       int val=head.val;
        head=head.next;
        if(head==null){
            return null;
        }
        return val;

    }
    //获取首元素
    public Integer peek(){
        if(head==null){
            return null;
        }
        return head.val;
    }


}
