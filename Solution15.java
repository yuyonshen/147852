public class Solution15 {
    //在原字符串中找子字符串,如果存在返回下标位置,如果不存在则返回-1;
    public int strStr(String haystack, String needle) {
        int i=0;

        if(haystack.contains(needle)){
            i=haystack.indexOf(needle);
            return i;
        }
       return -1;
    }
   //给定一个目标数组,和指定值,如果指定值在目标数组中出现返回下标
    //如果不存在则按照顺序插入
    public int searchInsert(int[] nums, int target) {
       int left=0;
       int rigth=nums.length-1;
       while(left<=rigth){
           int mid=(left+rigth)/2;
           if(nums[mid]==target){
               return mid;
           }else if(nums[mid]<target){
               left=mid+1;
           }else if(nums[mid]>target){
               rigth=mid-1;
           }

       }
       return left;
    }
    public String countAndSay(int n) {

    }
}
