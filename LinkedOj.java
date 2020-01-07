package java;
class Node{
    public int data;
    public Node next=null;

    public Node(int data){
       this.data=data;
    }
}
public class Linked {
    private Node head = null;

    public void addFirst(int data){//首节点插入一个元素
        Node node=new Node(data);
        if(head==null){
            head=node;
            return ;
        }
        node.next=head;
        head=node;
    }
    public void addLast(int data){//未节点插入一个数
        Node node=new Node(data);
        if(head==null){
            head.next=node;
            return;
        }
        Node tail=head;
        while(tail!=null){
            tail=tail.next;
        }
        tail.next=node;
    }
    public void display(){//打印一个链表
        for(Node cur=head;cur!=null;cur=cur.next){
            System.out.println(cur.data+" ");
        }
        System.out.println();
    }
    public int getSize() {
        int size=0;
        for(Node cur=head;cur!=null;cur=cur.next){
            size++;
        }
        return size;
    }
    public boolean addIndex(int index, int data){//判断师傅插入成功
        int size=getSize();
            if(index<0||index>size){
                return false;
            }
            if(index==0){
                addFirst(data);
                return true;
            }
            if(index==size){
                addLast(data);
                return true;
            }
           Node node=new Node(data);
        Node prev = getPos(index - 1);
               node.next=prev.next;
               prev.next=node;
               return true;

    }
     private Node getPos(int index){//查找index的下标
       Node cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur;
     }
    public boolean contains(int toFind){//查找tofind是否在这个链表中
        for(Node cur=head;cur!=null;cur=cur.next){
            if(toFind==cur.data){
                return true;
            }
        }
                return false;
    }
    
}

