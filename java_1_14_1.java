public class java_1_14_1 {
    class Solution {

        //将奇偶排序。所有偶数在前，所有奇数在后面
        public int[] sortArrayByParity(int[] A) {
            int left=0;
            int rigth=A.length-1;
            while(left<rigth){
                if(left<rigth&&A[left]%2==0){
                    left++;
                }if(left<rigth&&A[rigth]%2!=0){
                    rigth--;
                }else{
                    int tmp=A[left];
                    A[left]=A[rigth];
                    A[rigth]=tmp;
                }
            }
            return A;
        }

        public int pivotIndex(int[] nums) {
            int left=0;
            int rigth=nums.length-1;
            int mid=(left+rigth)/2;
            int result_l=0;
            int reslut_r=0;
            for(int i=0;i<=mid;i++){
                result_l=result_l+nums[i];
            }
            for(int j=rigth;j>=mid;j--){
                reslut_r=reslut_r+nums[j];
            }
            if(result_l==reslut_r){
                return nums[mid];
            }
            return -1;
        }
    }
    //找一个数组的中心引锁
    public int pivotIndex(int[] nums) {
        int ans = -1;
        int leftsum = 0;
        int rightsum = 0;
        for (int i = 0; i < nums.length; i++) rightsum += nums[i];
        for (int i = 0; i < nums.length; i++) {
            rightsum -= nums[i];
            if (leftsum == rightsum) {
                ans = i;
                break;
            } else {
                leftsum += nums[i];
            };
        };
        return ans;
    }
//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
//
//最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
//
//你可以假设除了整数 0 之外，这个整数不会以零开头.
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;


    }
}




