public class StringTrim {
   //去除字符串首尾处空白内容；
    public static void main(String[] args) {
        String str="     abc    ";
        String shortStr=str.trim();
        System.out.println("str的原值是: ["+str+"]");
        System.out.println("去除空白的值：["+shortStr+"]");
    }
}
