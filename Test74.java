package Person;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

class TestDemo{
    public int a;
    public static int count;
}
public class Test5 {
    public static void main(String[] args) {
        TestDemo ti=new TestDemo();
        ti.a++;
        TestDemo.count++;
        System.out.println(ti.a++);
        System.out.println(TestDemo.count++);
        System.out.println("========");
        TestDemo t2=new TestDemo();
        t2.a++;
        TestDemo.count++;
        System.out.println(t2.a++);
        System.out.println(TestDemo.count);

    }
}
