import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class StringTest6 {
    public static void main(String[] args) {
        //       String str = "name=zhangsan&san&age=18";
//        String[] str1 = str.split("&");
//        for (String x : str1) {
//            String[] str3 = x.split("=");
//            if (str3.length != 2) {
//                continue;
//            }
//            System.out.println(str3[0] +":"+ str3[1]);
//        }
//        String[] str1=str.split("&");
//        for(int i=0;i<str1.length;i++){
//            String[] temp=str1[i].split("=");
//            if(temp.length!=2){
//                continue;
//            }
//            System.out.println(temp[0]+":"+temp[1]);
//        }

        //字符串的截取
        //采取前闭后开的范围
//        String str="hello word";
//        String str1=str.substring(2);
//        String str2=str1.substring(2,6);
//        System.out.println(str2);
//        System.out.println(str1);

//字符串的大小写转换
//        String str = "Hello";
//        String str1 = str.substring(0,1).toLowerCase() + str.substring(1);
//        System.out.println(str1);


//        StringBuffer和StringBuilder是可变字符串
//        StringBuffer stringBuffer=new StringBuffer();
//        stringBuffer.append("Hello").append(" word");
//        fun(stringBuffer);
//        System.out.println(stringBuffer);
//    }
//    public static void fun(StringBuffer temp){
//        temp.append("\n").append("www.bit.com.cn");
        //字符串的反转
        StringBuffer stringBuffer=new StringBuffer("abcd");
        System.out.println(stringBuffer.reverse());
        //删除指定引锁位置上的元素,采用前闭后开
        System.out.println(stringBuffer.delete(1,3));
        //在指定引锁的位置上插入指定字字符串或者字符
        System.out.println(stringBuffer.insert(1,"sfddf"));
    }
}
