import java.util.Arrays;

public class Test87 {//给定两个整型数组, 交换两个数组的内容.

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr2={6,7,8,9,0};
        for(int i=0;i<arr.length;i++){
            int tmp=arr[i];
            arr[i]=arr2[i];
            arr2[i]=tmp;
        }

            System.out.println(Arrays.toString(arr));


            System.out.println(Arrays.toString(arr2));

    }
}
