//查找数组中的元数
/*public class Test58{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int ret=find(arr,5);
        System.out.println(ret);
    }
    public static int find(int[] arr1,int num){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==num){
                return i;
            }
        }
        return -1;
    }
}*/
//查找数组中指定的元数（二分查找）
public class Test58{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int ret=find(arr,5);
        System.out.println(ret);

    }
    public static int find(int[] arr1,int num){
        int left=0;
        int right=arr1.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(num>arr1[mid]){
                left=mid+1;
            }else if(num<arr1[mid]){
                right=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}