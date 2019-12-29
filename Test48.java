import java.util.Arrays;

//编写代码: 实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
public class Test48{
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[] arr2=transform(arr);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] transform(int[] a){
       int[] ret=new int[a.length];
        for(int i=0;i<a.length;i++){
            ret[i]=a[i]*2;
        }
       return ret;
    }
}