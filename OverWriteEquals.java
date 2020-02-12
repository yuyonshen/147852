class V{

}
public class OverWriteEquals {
    public static void main(String[] args) {
        //实例化两个对象，内容相同
        String s1=new String("123");
        String s2=new String("123");
        //使用equals（）方法调用
        System.out.println(s1.equals(s2));
        //实例化两个V类对象
        V v1=new V();
        V v2=new V();
        System.out.println(v1.equals(v2));
    }
}
