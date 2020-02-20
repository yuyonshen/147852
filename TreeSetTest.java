import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        //创建集合对象
        Set<Integer> set=new TreeSet<Integer>();
        set.add(-5);
        set.add(-7);
        set.add(10);
        set.add(6);
        set.add(3);
        Iterator<Integer> it=set.iterator();
        System.out.println("Set集合中的元素");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
