public class StringBufferAppend {
//    public static void main(String[] args) {
//        StringBuffer sbf=new StringBuffer("门前大桥下，");
//        sbf.append("游过一只鸭，");
//        StringBuffer tmp=new StringBuffer("快来快来数一数，");
//        sbf.append(tmp);
//        int x=24678;
//        sbf.append(x);
//        System.out.println(sbf.toString());
//    }
public static void main(String[] args) {
    StringBuffer a=new StringBuffer("日期:");
    a.append("2016-01-01");
    System.out.println(a.toString());
    StringBuffer b=new StringBuffer("户名:");
    b.append("张三丰");
    System.out.println(b.toString());
    StringBuffer c=new StringBuffer("账户：");
    int d=12349;
    c.append(d);
    System.out.println(c.toString());
    StringBuffer e=new StringBuffer("币种:");
    e.append("RMB");
    System.out.println(e.toString());
    StringBuffer f=new StringBuffer("存款金额:");
    f.append("155000");
    System.out.println(f.toString());
    StringBuffer g=new StringBuffer("存款序号:");
    g.append("010");
    System.out.println(g.toString());
    StringBuffer h=new StringBuffer("柜员:");
    h.append("12345");
    System.out.println(h.toString());
}
}
