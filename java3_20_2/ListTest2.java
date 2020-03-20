package java3_20_2;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        int i=(int)(Math.random()*list.size());
        System.out.println("随机获取集合中的元素:"+list.get(i));
        list.remove(2);
        System.out.println("引锁2的远古三删除之后的集合");
        for(int j=0;j<list.size();j++){
            System.out.println(list.get(j));
        }
    }
}
