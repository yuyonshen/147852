//找数组中最大的元数
/*public class Test57{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,56,8,45,6};
        System.out.println(MAX(arr));
    }
    public static int MAX(int[] arr1){
        int max=arr1[0];
        for(int i=1;i<arr1.length;i++){
            if(max<arr1[i]){
               max=arr1[i];
            }
        }
        return max;
    }
}*/
//求数组中原数的平均值
public class Test57{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,56,6};
        double num=agv(arr);
        System.out.println(num);

    }
    public static double agv(int[] arr1){
        double num=0;
        for(int x:arr1){
            num+=x;
        }
        return num/arr1.length;

    }
}