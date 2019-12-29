//给定一个整型数组, 判定数组是否有序
public class Test54{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(order(arr));
    }
    public static boolean order(int[] arr1){
        for(int i=1;i<arr1.length;i++){
            if(arr1[i-1]>arr1[i]){
                return false;
            }
        }
        return true;
    }
}