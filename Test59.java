import java.util.Arrays;

//检查数组的有序性
/*public class Test59{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        System.out.println(issorted(arr));

    }
    public static boolean issorted(int[] arr1){
        for(int i=1;i<arr1.length;i++){
            if(arr1[i-1]>arr1[i]){
                return false;
            }
        }
        return true;
    }
}*/
//数组的冒泡排序法；
import java.util.Arrays;
public class Test59{
    public static void main(String[] args) {
        int[] arr={1,76,2,4,7};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubble(int[] arr1){
        for(int i=0;i<arr1.length-1;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]<arr1[j]){
                    int tmp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=tmp;
                }
            }
        }

    }
}