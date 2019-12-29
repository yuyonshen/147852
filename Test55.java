import java.util.Arrays;

//给定一个整型数组, 实现冒泡排序(升序排序)
public class Test55{
    public static void main(String[] args) {
        int[] arr={2,5,8,1,3,9,0};
        order(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void  order(int[] arr1){
        for(int i=0;i<arr1.length;i++){
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