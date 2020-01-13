import java.lang.reflect.Array;

public class Test99{
    public static void main(String[] args) {
        int[] nums1={1,2,3,4,5};
        int[] nums2={6,7,8,9};
         merge(nums1,5,nums2,4);

    }
    
 public static void merge(int[] nums1, int m, int[] nums2, int n) {
            
            int[] nums3=new int[n+m]; 
          System.arraycopy(nums1,0,nums3,0,nums1.length);
           System.arraycopy(nums2, 0, nums3, nums3.length, nums2.length); 
                  for(int i=0;i<nums3.length-2;i++){
                      for(int j=i+1;j<nums3.length-1;j++){
                          if(nums3[i]>nums3[j]){
                              int tmp=nums3[i];
                              nums3[i]=nums3[j];
                              nums3[j]=tmp;
                          }
                      }
    
                  }
      for(int a=0;a<nums3.length;a++){
                  System.out.println(nums3[a]);
          }
        }
    }
