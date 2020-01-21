
class Solution {
    //字符串转换为整数
    public int myAtoi(String str) {
        long res = 0;
        boolean flag = true;
        int f = -1;
        char[] c = str.toCharArray();
        for(int i = 0; i<c.length;i++) {
            if(f==-1 && (c[i]=='-' || c[i]=='+') ) {
                flag = c[i]=='-'?false:true;
                f = 1;
            }else if(Character.isDigit(c[i])) {
                res = res*10 + (c[i]-'0');
                if(res>Integer.MAX_VALUE){
                    if(!flag) return  Integer.MIN_VALUE;
                    return Integer.MAX_VALUE;
                }
                f = 1;
            }else if(c[i]>30 ){
                if(f==-1 && c[i]==' ') continue;
                break;
            }
        }
        return flag == true?(int)res:(int)-res;
    }
    //找目标数的下标。返回数组。
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                arr[0]=i;
                break;
            }
        }
        if(arr[0]==-1){
            return arr;
        }
        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]==target){
                arr[1]=j;
                break;
            }
        }
        return arr;
    }
}


public class Java_1_21_1 {
}
