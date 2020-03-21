import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
    public static void main(String[] args) {
        //Map是一个接口所以不能实例化,我们需要实现一个方法
        Map<String,String> map=new HashMap<>();
        //判断集合是否为空
        System.out.println(map.size());
        //判断集合的长度
        System.out.println(map.isEmpty());
        //向集合中增加元素
        map.put("1","haha");
        map.put("2","heihei");
        map.put("3","hehe");
        //根据key值查找values
        System.out.println(map.get("1"));
        //根据k值查找v值,如果找到返回该v值,如果没有则增加v值
        System.out.println(map.getOrDefault("2","gun"));
        //判断是否包含k值
        System.out.println(map.containsKey("3"));
        //判断是否包含v值
        System.out.println(map.containsValue("haha"));
        //将所有的键值对返回
        for(Map.Entry<String ,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
