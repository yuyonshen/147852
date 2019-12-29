//给定一个有序整型数组, 实现二分查找
public class Test53{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(bingary(arr,3));
    }
    public static int bingary(int[] a,int num){
        int left=0;
        int right=a.length-1;
        
       
        while(left<=right){
            int mid=(left+right)/2;
            if(num<a[mid]){
                right=mid-1;
            }else if(num>a[mid]){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}