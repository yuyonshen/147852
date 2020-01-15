
class Solution {
    //找一个数组中的第三大数，返回第三大数
    public int thirdMax(int[] nums) {
        int min=0;
        if(nums.length==2){
            if(nums[0]>nums[1]){
                return nums[0];
            }else{
                return nums[1];
            }
        }if(nums.length==1){
            return nums[0];
        }if(nums.length==3){

            if(nums[0]>nums[1]){

                if(nums[2]>nums[1]){
                    min=nums[1];
                }else{
                    min=nums[2];
                }
            }
            if(nums[0]<nums[1]){
                if(nums[0]<nums[2]){
                    min=nums[0];
                }else{
                    min=nums[2];
                }
            }
            return min;
        }
        if(nums.length>3){
            for(int i=0;i<nums.length-1;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]<nums[j]){
                        int tmp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=tmp;
                    }
                }
            }
        }
        return nums[2];
    }

    //给定一个数组在给一个指定值，在数组中找到两个数之和等于指定值；
    public int[] twoSum(int[] nums, int target) {
        int length=nums.length;
        for(int i=0;i<length-1;i++){
            for(int j=i+1;j<length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}



public class Java1_15_1 {
}
