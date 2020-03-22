package java3_22_1;

import java.util.ArrayList;
import java.util.List;

public class A<T> {
    T valuse;
    public A(T valuse){
        this.valuse=valuse;
    }
    public T get(){
        return valuse;
    }

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        System.out.println(list.get(0));
    }
}
