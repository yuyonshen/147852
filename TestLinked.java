package java;

public class TestLinked {
    private static void testaddFirst() {
        Linked linked = new Linked();
        linked.addFirst(1);
        linked.addFirst(2);
        linked.addFirst(3);
        linked.addFirst(4);
        linked.display();
    }

    private static void testAddLast() {
        Linked linkedList = new Linked();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.display();
    }

    public static void main(String[] args) {
        //testaddFirst();
        testAddLast();
    }

}
