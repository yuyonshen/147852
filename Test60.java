import java.util.Arrays;

//数组逆序
/*public class Test60{
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        reverse(arr);
    }
    public static void reverse(int[] arr1){
        int left=0;
        int right=arr1.length-1;
        while(left<right){
            int tmp=arr1[left];
            arr1[left]=arr1[right];
            arr1[right]=tmp;
            left++;
            right--;
        }
        System.out.println( Arrays.toString(arr1));
    }
}*/
//数组数字排列
public class Test60{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        transform(arr);
    }
    public static void transform(int[] arr1){
        int left=0;
        int right=arr1.length-1;
        while(left<right){
            if(left<right&&arr1[left]%2==0){
                left++;
            }else if(left<right&&arr1[right]%2!=0){
                right--;
            }else{
            int tmp=arr1[left];
            arr1[left]=arr1[right];
            arr1[right]=tmp;
          }
    }
        System.out.println(Arrays.toString(arr1));
    }
}