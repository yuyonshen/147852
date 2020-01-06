package java;

public class TestLinkedList {
    public static void  testAddFirst(){//头插
        LinkedList linkedList=new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
    }
    public static void testaddLast(){//尾插
        LinkedList linkedList=new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.display();
    }
    public static void testdisplay(){
        LinkedList linkedList=new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);

    }
    public static void main(String[] args) {
       testAddFirst();
        testaddLast();
        testdisplay();
    }
}
