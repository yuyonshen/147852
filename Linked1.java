package java;

class Node {
    public int data;
    public Node next = null;

    public Node(int data) {
        this.data = data;
    }
}

    public class Linked {
        private Node head = null;

        public  void addFirst(int data) {
            Node node = new Node(data);
            if (head == null) {
               head=node;
                return;
            }
            node.next = head;
            head = node;
        }
        public void addLast(int data){
            Node node=new Node(data);
            if(head==null){
                head=node;
                return ;
            }
            Node tail=head;
            while(tail.next!=null){
                tail=tail.next;
            }
            tail.next=node;
        }
        //把链表中的每个元素都打印出来
        public void display(){
            for(Node cur=head;cur!=null;cur=cur.next){
                System.out.println(cur.data+" ");
            }
            System.out.println();
        }
        public int getSize(){
            int size=0;
            for(Node cur=head;cur!=null;cur=cur.next){
                size++;
            }
            return size;
        }
        //// 插入成功, 返回 true, 否则 false
        public boolean addIndex(int index,int data ){
          int size=getSize();
          if(index<0||index<size){
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
            Node pos=getPos(index);

            node.next=pos.next;
            pos.next=node;
            return true;
        }
        public Node getPos(int index){
            Node cur=head;
            for(int i=0;i<index;i++){
                cur=cur.next;
            }
            return cur;
        }
        public boolean contains(int toFind){
            for(Node cur=head;cur!=null;cur=cur.next){
                if(cur.data==toFind){
                    return true;
                }
            }
            return false;
        }
        public void remove(int toRemove){
            if(head.data==toRemove){
                head=head.next;
                return ;
            }
            Node prev=searchPrev(toRemove);
            Node toDelete=prev.next;
            prev.next=toDelete.next;
        }
        public Node searchPrev(int toRemove){
            for(Node cur=head;cur.next!=null&&cur!=null;cur=cur.next){
                if(cur.next.data==toRemove){
                    return cur;
                }
            }
            return null;
        }

    }

