package Java;

public class TestSeqlist {
    public static void testAdd(){
        Seqlist seqlist=new Seqlist();
        seqlist.add(0,1);
        seqlist.add(1,2);
        seqlist.add(2,3);
        seqlist.add(3,4);
        seqlist.display();
    }

    public static void testContians(){
        Seqlist seqlist=new Seqlist();
        seqlist.add(0,1);
        seqlist.add(1,2);
        seqlist.add(2,3);
        seqlist.add(3,4);
        System.out.println(seqlist.contians(2));

    }
    public static void testSearch(){
        Seqlist seqlist=new Seqlist();
        seqlist.add(0,1);
        seqlist.add(1,2);
        seqlist.add(2,3);
        seqlist.add(3,4);
        System.out.println(seqlist.search(2));
    }
    public static void main(String[] args) {
        testAdd();
        testContians();
        testSearch();
    }
}
