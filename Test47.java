//编写代码: 实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
public class Test47{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
         printArray(arr);
       
    }
    public static void printArray(int[] a){
        int ret=0;
        for(int x:a){
         System.out.println(x);
        }
        
    }
}