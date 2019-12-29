//实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量. 
public class Test51{
    public static void main(String[] args) {
        int[] arr={1,2,3};
        toString(arr);
        System.out.println( toString(arr));
    }
    public static String toString(int[] arr1){
         String a="[";
         for(int i=0;i<arr1.length;i++){
                a+=arr1[i]; 
            if(i<arr1.length-1){
                 a=a+",";
             }
         }
         a+="]";
         return a; 
    }
}