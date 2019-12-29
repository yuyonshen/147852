//实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
public class Test49{
    public static void main(String[] args) {
            int[] arr={1,2,3,4,5};
            sum(arr);
            System.out.println(sum(arr));

    }
    public static int sum(int[] arr1){
        int num=0;
        for(int x:arr1){
            num=num+x;
        }
        return num;
    }
}