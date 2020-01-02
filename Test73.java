package Person;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Man{
    public int age=18;
    public String name="张三";

    public void show(){
        System.out.println("我叫"+name+",今年"+age+"岁数");
    }
}
public class Test4 {
    public static void main(String[] args) {
     Man man1=new Man();
    man1.age=20;
    man1.name="李四";
    man1.show();
    }
}
