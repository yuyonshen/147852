package java3_32_1;

import java.util.ArrayList;
import java.util.List;

public class ArraylistTest3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        //判断集合空间的大小
        System.out.println(list.size());
        //判断集合是否为空,如果集合的空间为空返回true否则返回false
        System.out.println(list.isEmpty());
        //向集合中增加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        //输出集合中的元素
        System.out.println(list);
        //根据下表查询链表中的元素
        System.out.println(list.get(0));
        //向集合中增加元素,在指定位置上增加元素
        list.set(3,"f");
        System.out.println(list.set(3,"f"));
        //截取集合中的元素,根据下表截取一段元素,截取原色的区间是前闭后开区间
        List<String> list2=list.subList(0,2);
        System.out.println(list2);

    }
}
