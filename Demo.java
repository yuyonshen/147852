public class Demo {
    public static void main(String[] args) {
        //将字符串转换为int类型
        int num=Integer.parseInt("456");
        //通过构造函数创建一个Integer对象
        Integer iNum=new Integer("456");
        System.out.println("int数据以与Integer对象的比较"+iNum.equals(num));
    //获取数字的二进制表示
        String str2=Integer.toBinaryString(num);
        //获取数字十六进制表示
        String str3=Integer.toHexString(num);
        //获取数字八进制表示
        String str4=Integer.toOctalString(num);
        //获取数字15进制表示
        String str5=Integer.toString(num,15);
        System.out.println("456的二进制表示: "+str2);
        System.out.println("456的十六进制表示: "+str3);
        System.out.println("456的八进制表示: "+str4);
        System.out.println("456的十五进制表示: "+str5);
       
    }
}
