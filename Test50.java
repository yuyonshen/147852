// 实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
public class Test50{
    public static void main(String[] args) {
        int[] arr={6,7,9,4};
        double ret=avg(arr);
        System.out.println(ret);
    }
    public static double avg(int[] arr1){
        double num=0;
        double ret=0;
        for(int x:arr1){
            num+=x;
        }
        ret=num/arr1.length;
        return ret;
    }
}
