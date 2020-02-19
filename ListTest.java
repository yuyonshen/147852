import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class ListTest {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        int i=(int)( Math.random()* list.size());
        System.out.println("随机获取集合中的元素"+list.get(i));
        list.remove(2);
        for(int j=0;j<list.size();j++){
            System.out.println(list.get(j));
        }
    }
}
