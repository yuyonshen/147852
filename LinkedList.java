package java;

class Node{
    public int data;
    public Node next=null;

    public Node(int data){
        this.data=data;
    }
}

public class LinkedList {
    private Node head = null;

    public void addFirst(int data) {//头插法
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void addLast(int data) {//尾插法
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node tail = head;
        while (tail != null) {
            tail = tail.next;
        }
        tail.next = head;
    }

    public boolean contains(int key) {//查找是否包含关键字key是否在链表中
        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.data == key) {
                return true;
            }
        }
        return false;
    }

    public void display() {//打印链表
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.println(cur.data + " ");
        }
        System.out.println();
    }

    public int gitsize() {
        int size = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }

    public boolean contains(int index, int data) {//任意位置插入，第一个位置下表为0
        int size = gitsize();
        if (index < 0 || index > size) {
            return false;
        }
        if (index == 0) {
            addFirst(data);
            return true;
        }
        if (index == size) {
            addLast(data);
            return true;
        }
        Node node=new Node(data);
        Node prev = getPos(index - 1);
        prev.next = node;
        return true;
    }
    private Node getPos(int index) {//给定相应的下表找节点；
        Node cur = head;
        for (int i = 0; i < index; i++) {
            // cur.next 操作之前必须要保证
            // cur 是非 null 的
            cur = cur.next;
        }
        return cur;
    }
    public void removellkey(int key){//删除值为key的节点
        if(head.data==key){
            head=head.next;
            return;
        }
        Node prev = searchPrev(key);
        // 3. 修改引用的指向, 完成删除
        // prev.next = prev.next.next;
        Node toDelete = prev.next;
        prev.next = toDelete.next;
    }
    private Node searchPrev(int toRemove) {
        // 找到 toRemove 的前一个节点
        for (Node cur = head; cur != null
                && cur.next != null; cur = cur.next) {
            if (cur.next.data == toRemove) {
                return cur;
            }
        }
        return null;
    }
}
