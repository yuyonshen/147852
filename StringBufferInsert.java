public class StringBufferInsert {
   //vip插队排号；
//    public static void main(String[] args) {
//        StringBuffer sbf=new StringBuffer();
//        sbf.append("057号客户请在窗口受理,");
//        sbf.append("058号客户请到窗口受理,");
//        System.out.println("原始字符串："+sbf);
//        sbf.insert(13,"01号vip客服请到窗口受理,");
//        System.out.println("插入vip后："+sbf);
//    }
//
   public static void main(String[] args) {
       StringBuffer sbf=new StringBuffer();
       sbf.append("张三,");
       sbf.append("李四，");
       sbf.append("王五，");
       sbf.append("赵六");
       sbf.insert(0,"周七，");
       System.out.println(sbf);
   }
}
