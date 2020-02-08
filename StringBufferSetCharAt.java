import com.sun.org.apache.xpath.internal.operations.String;
public class StringBufferSetCharAt{
public static void main(String[]args){


       //创建StringBuffer对象，记录一个手机号
        StringBuffer phoneNum=new StringBuffer("15319368550");
        for(int i=3;i<=6;i++){
            phoneNum.setCharAt(i,'x');
        }
        System.out.println("幸运观众的手机号为："+phoneNum);
    }
}
