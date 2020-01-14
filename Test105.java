public class Test102{
public static void main(String[] args) {
    int[] arr={-1,-1,-1,-1,-1,-1};
    
System.out.println(pivotIndex(arr));
}


public  static int pivotIndex(int[] nums) {
    int left=0;
    int rigth=0;
    int num=0;
    if(nums.length==0){
        return -1;
    }
    for(int i=0;i<nums.length;i++){
        rigth+=nums[i];
    }
        for(int j=0;j<nums.length;j++){
        rigth-=nums[j];
        left+=nums[j];
       
        if((rigth-left)==nums[j+1]){
            num=j+1;
            return num;
            
            
        }
    }
    return -1;
}
}
