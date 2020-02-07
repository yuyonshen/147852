public class StringEquals {
   //判断了个字符串是否相等；
    public static void main(String[] args) {
        String str1="hello";
        String str2=new String("hello");
        String str3=new String("你好");
        String str4=str2;
        System.out.println("str1==str2的结果："+(str1==str2));
        System.out.println("str1==str3的结果："+(str1==str3));
        System.out.println("str1==str4的结果："+(str1==str4));
        System.out.println("str2==str4的结果："+(str2==str4));
        System.out.println("str1.equals(str2)的结果："+str1.equals(str2));
        System.out.println("str1.equals(str3)的结果："+str1.equals(str3));
        System.out.println("str1.equals(str4)的结果："+str1.equals(str4));
    }
}
