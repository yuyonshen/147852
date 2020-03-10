public class Solution2 {
    public int maxArea(int[] height){
        int Gao=0;
        int Width=0;
        int maxheigth=0;
        int len=0;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                if(height[i]>height[j]){
                    Gao=height[j];
                }else{
                    Gao=height[i];
                }
                len=Gao*(j-i);
                if(len>maxheigth){
                    maxheigth=len;
                }
            }
        }
        return maxheigth;
    }

    public String intToRoman(int num){
            int[] nums = {1000, 900,  500, 400,  100,  90,  50,  40,  10,    9,    5,   4,    1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        while (index < 13) {

            while (num >= nums[index]) {

                stringBuilder.append(romans[index]);
                num -= nums[index];
            }
            index++;
        }
        return stringBuilder.toString();
    }



}
