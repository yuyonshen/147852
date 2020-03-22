import java.util.ArrayList;
import java.util.List;

//泛型的使用
public class B<T> {
    private T value;

    public B(T value){
        this.value=value;
    }
    public T get(){
        return value;
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(2));
    }
}
