


import java.util.Arrays;

//给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
public class Test88 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void transform(int[] arr1){
        int left=0;
        int right=arr1.length-1;
        while(left<right){
            while(left<right&&arr1[left]%2==0){
                left++;
            }
            while (left<right&&arr1[right]%2!=0){
                right--;
            }
            int tmp=arr1[left];
            arr1[left]=arr1[right];
            arr1[right]=tmp;
        }
    }
}
