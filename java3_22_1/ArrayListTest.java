package java3_22_1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        //向数组中增加元素
        list.add("c语言");
        list.add("java");
        list.add("PHP");
        list.add("c++");
        //打印数组
        System.out.println(list);
        //根据下表查找数组中的元素
        System.out.println(list.get(1));
        //根据指定下标更改元素
        System.out.println(list.set(0,"ph"));
        System.out.println(list);
        //根据下标截取数组元素
        System.out.println(list.subList(0,2));
        //循环遍历打印数组元素
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
