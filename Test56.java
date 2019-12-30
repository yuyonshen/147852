import java.util.Arrays;

//数组转换为字符串
/*public class Test56{
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        newarr(arr);
    }
    public static void newarr(int[] arr1){
        System.out.println(Arrays.toString(arr1));
    }
}*/
//数组的拷贝
import java.util.Arrays;
public class Test56{
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6};
        int[] newarr=Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(newarr));
    }
}