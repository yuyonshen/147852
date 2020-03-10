import java.util.HashSet;
import java.util.Set;

public class Soution2 {
    //求数组中两数之差最大的值
    public int maxProfit(int[] prices) {
        int maxprices=0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                int pritix=prices[j]-prices[i];
                if(pritix>maxprices){
                    maxprices=pritix;
                }
            }
        }
        return maxprices;
    }
    //给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        //Set接口中的HashSet类他不允许有重复元素。
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            //contains()判断字符中是否有重复元素，如果有返回false 没有返回true
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }

    public String longestPalindrome(String s) {
        if(s==null||s.length()<1){
            return "";
        }
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int len1=expandAroundCenter(s,i,i);
            int len2=expandAroundCenter(s,i,i+1);
            int len=Math.max(len1,len2);
            if(len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start, end + 1);
    }
    private int expandAroundCenter(String s, int left, int right){
        int L=left;
        int R=right;
        while(L>=0&&R<s.length()&&s.charAt(L)==s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }
}
