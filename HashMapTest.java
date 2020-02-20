import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("ISBN 978-7-5677-8742-1","Android项目开发实战入门");
        map.put("ISBN 978-7-5677-8741-4","c语言项目开发实战入门");
        map.put("ISBN 978-7-5677-9097-1","PHP下面航母开发实战入门");
        map.put("ISBN 978-7-5677-8740-7","Java项目开发实战入门");
       Set<String> set=map.keySet();
        Iterator<String> it=set.iterator();
        System.out.println("key的值：" );
        while(it.hasNext()){
            System.out.print(it.next()+"  ");
        }
        Collection<String> coll=map.values();//构建Map集合中所有valuer对象的集合。
        it=coll.iterator();
        System.out.println("\nvalue值：");
        while(it.hasNext()){
            System.out.print(it.next()+"  ");
        }
    }
}
