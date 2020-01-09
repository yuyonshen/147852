package java;

class Solution {//实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
    public String toLowerCase(String str) {
        char[] st = new char[str.length()];
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c >= 65 && c <= 90) {
                c = (char) (c + 32);
            }
            st[i] = c;
        }
        return new String(st);


    }

//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
    public void rotate(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }
    //给定一个数组 nums 和一个值 val ，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度
    public int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
    //给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它
    //将会被按顺序插入的位置,你可以假设数组中无重复元素.
    public int searchInsert(int[] nums, int target){
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
        public boolean isPalindrome(int x) {
            if(x < 0)
                return false;
            int cur = 0;
            int num=x;
            while(num != 0) {
                cur = cur * 10 + num% 10;
                num/= 10;
            }
            return cur == x;



        }


