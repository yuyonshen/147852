//赎金信
//回文数
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int cur = 0;
        int num = x;
        while(num != 0) {
            cur = cur * 10 + num % 10;
            num /= 10;
        }
        return cur == x;
    }

//给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
//
//如果不存在最后一个单词，请返回 0 。
    public int lengthOfLastWord(String s) {
        if(s==null&&s.length()==0){
            return 0;
        }
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(count==0){
                    continue;
                }
                break;
            }
            count++;
        }
        return count++;
    }
}

public class Test95 {

}
