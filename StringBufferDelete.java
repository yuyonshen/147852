public class StringBufferDelete {
//    public static void main(String[] args) {
//        String value="各位观众大家好，欢迎准时打开电梯不对是电视机收看节目";
//        StringBuffer sbf=new StringBuffer(value);
//        System.out.println("原始值："+sbf);
//        sbf.delete(14,19);
//        System.out.println("删除后："+sbf);
//    }
public static void main(String[] args) {
    StringBuffer sbf=new StringBuffer("周七，张三，李四，王五，赵六");
    sbf.delete(3,6);
    System.out.println(sbf);
}
}
