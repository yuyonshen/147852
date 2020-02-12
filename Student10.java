import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

interface Greet{
    String Say="老师好";
    String Say1="同学们好";
    public void A1();
        }
 interface  Work{
    String Dry="老师开始上课";
    String Dry1="同学开始记笔记";
    public void B2();
 }
 class Student implements Greet{
    public void A1(){
        System.out.println("peter:"+Say);
    }
 }
 class teacher implements Greet{

    public void A1(){
        System.out.println("mike："+Say1);
    }
 }
 class teacher1 implements Work{
    public void B2(){
        System.out.println("mike："+Dry);
    }
 }
 class Student1 implements  Work{
    public void B2(){
        System.out.println("peter:"+Dry1);
    }
        }
public class Student10 {
    public static void main(String[] args) {
        Greet greet=new Student();
        greet.A1();
        Greet greet1=new teacher();
        greet1.A1();
        Work work=new teacher1();
        work.B2();
        Work work1=new Student1();
        work1.B2();
    }
}
