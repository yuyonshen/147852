import java.util.Arrays;

//实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组. 
public class Test52{
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] arr3=copyof(arr);
        System.out.println(Arrays.toString(arr3));
    }
    public static int[] copyof(int[] arr1){
        int[] arr2=Arrays.copyOf(arr1,arr1.length);
        return arr2;
    }
}