package Java;

public class Test94 {

    private static void testAdd() {//增加元素
        SeqList seqList = new SeqList();
        seqList.add(0,100);
        seqList.add(1,200);
        seqList.add(2,300);
        seqList.add(3,400);
        seqList.display();
    }
    public static  void teatContains(){//判断是否重载这个元素
        SeqList seqList = new SeqList();
        seqList.add(0,100);
        seqList.add(1,200);
        seqList.add(2,300);
        seqList.add(3,400);
        System.out.println(seqList.contains(200));
    }
    public static void testSearch(){//查找这个元素的位置
        SeqList seqList = new SeqList();
        seqList.add(0,100);
        seqList.add(1,200);
        seqList.add(2,300);
        seqList.add(3,400);
        System.out.println(seqList.search(200));
    }
    public static void testGetPos(){
        SeqList seqList = new SeqList();
        seqList.add(0,100);
        seqList.add(1,200);
        seqList.add(2,300);
        seqList.add(3,400);
        System.out.println(seqList.getPos(2));
    }
    public static void testSetPos(){
        SeqList seqList = new SeqList();
        seqList.add(0,100);
        seqList.add(1,200);
        seqList.add(2,300);
        seqList.add(3,400);

       seqList.setPos(2,500);
       seqList.display();
    }
    public static void main(String[] args) {
        //testAdd();
        //teatContains();
       // testSearch();
        //testGetPos();
        testSetPos();
    }
}
