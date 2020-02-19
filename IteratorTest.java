import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        //创建迭代器
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String str=(String)it.next();
            System.out.println(str);
        }


    }
}
