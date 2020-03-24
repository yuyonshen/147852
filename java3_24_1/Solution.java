package java3_24_1;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    //给出一个32位有符号的整数,进行翻转
    public int reverse(int x){
        int rev=0;
        while(x!=0){
            int prv=x%10;
            x/=10;

            if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && prv > Integer.MAX_VALUE % 10)){
                rev = 0;
                break;
            }else if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && x < Integer.MIN_VALUE % 10)){
                rev = 0;
                break;
            }
            rev=rev*10+prv;
        }
        return rev;
    }
    //删除数组中的重复项
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int size=0;
        for(int i=0;i<nums.length;i++){
            if(set.add(nums[i])){
                size++;
            }
        }
        return size;
    }
    public int removeDuplicates2(int[] nums){
       if(nums.length==0){
           return 0;
       }
       int i=0;
       for(int j=1;j<nums.length;j++){
           if(nums[i]!=nums[j]){
               i++;
               nums[i]=nums[j];
           }
       }
       return i+1;
    }
}
