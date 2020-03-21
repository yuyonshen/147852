import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        //集合中Collection接口的使用
        //collection是一个接口所以不能实例化,所以需要找到一个实现方法
        Collection<String> collection=new ArrayList<>();
        //判断集合的长度
        System.out.println(collection.size());
        //判断集合是否为空
        System.out.println(collection.isEmpty());
        //向集合中增加元素
        collection.add("a");
        collection.add("b");
        collection.add("c");
        //将集合转换为数组形式
        Object[] array=collection.toArray();
        //打印数组
        System.out.println(Arrays.toString(array));
        for(String x:collection){
            System.out.println(x);
        }
       //移除集合中逇一个元素
        collection.remove("b");
        for(String s:collection){
            System.out.println(s);
        }
        //将集合中清空
        collection.clear();
        System.out.println(collection.size());
    }
}
