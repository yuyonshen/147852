import java.util.HashSet;
import java.util.Set;

public class Soution3 {
    //求数组中两个数之间差的最大数
    public int maxProfit(int[] prices){
        int maxprices=0;
        for(int i=0;i<prices.length+1;i++){
            for(int j=i+1;j<prices.length;j++){
                int price=prices[j]-prices[i];
                if(price>maxprices){
                    maxprices=price;
                }
            }
        }
        return maxprices;
    }
//给定一个字符串求出不包含重复字符的子字符串
    public int lengthOfLongestSubstring(String s){
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;i++){
                if(allUnique(s,i,j)){
                    ans=Math.max(ans,j-i);
                }
            }
        }
        return ans;
    }
    public boolean allUnique(String s, int start, int end){
        Set<Character> set=new HashSet<Character>();
        for(int i=start;i<end;i++){
            Character ch=s.charAt(i);
            if(set.contains(ch)){
                return false;
            }
            set.add(ch);
        }
        return true;
    }

    public String longestPalindrome(String s){
        int size=s.length();
        int strat=0;
        int end=0;
        for(int i=0;i<size;i++){
            int len1=expandAroundCenter(s,i,i);
            int len2=expandAroundCenter(s,i,i+1);
            int len=Math.max(len1,len2);
            if(len>end-strat){
                strat=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(strat,end+1);
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
