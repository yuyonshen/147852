class Solution {//合并两个有序数组，并且排序

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Make a copy of nums1.
        int [] nums1_copy = new int[m];
        System.arraycopy(nums1, 0, nums1_copy, 0, m);

        // Two get pointers for nums1_copy and nums2.
        int p1 = 0;
        int p2 = 0;

        // Set pointer for nums1
        int p = 0;

        // Compare elements from nums1_copy and nums2
        // and add the smallest one into nums1.
        while ((p1 < m) && (p2 < n))
            nums1[p++] = (nums1_copy[p1] < nums2[p2]) ? nums1_copy[p1++] : nums2[p2++];

        // if there are still elements to add
        if (p1 < m)
            System.arraycopy(nums1_copy, p1, nums1, p1 + p2, m + n - p1 - p2);
        if (p2 < n)
            System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
    }

//判断一个数组是否有相同元素。如果有相同元素返回true，否则返回false；
    public boolean containsDuplicate(int[] nums) {


        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }


        return false;
    }


//判断连个字符串是否相等。后面字符串课出现字母重复
    public boolean isLongPressedName(String name, String typed) {
        int len_n=name.length();
        int len_t=typed.length();
        if(len_n>len_t){
            return false;
        }
        int i=0;
        int j=0;
        while(i<len_n&&j<len_t){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }else if(j>0&&typed.charAt(j)==typed.charAt(j-1)){
                j++;
            }else{
                return false;
            }
        }
        return true;
    }

//将一个数组的每个元素平方之后降序排组成一个新的数组
    public int[] sortedSquares(int[] A) {
        int length=A.length;
        int[] arr=new int[A.length];
        for(int i=0;i<length;i++){
            arr[i]=A[i]*A[i];
        }
        for(int j=0;j<length-1;j++){
            for(int z=j+1;z<length;z++){
                if(arr[j]>arr[z]){
                    int tmp=arr[j];
                    arr[j]=arr[z];
                    arr[z]=tmp;
                }
            }
        }
        return arr ;

    }
}

public class Test98 {
}
