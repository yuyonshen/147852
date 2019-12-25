//有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
public class Test32{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,1,2,3,4,5};
        int count=0;
        int i;
        for( i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]); 
            }
            count=0;
        }
       
    }
    }
   