public class Test93 {
    public static void main(String args[]) {
       int num=121;
        System.out.println(isPalindrome(121));
    }
    public boolean isPalindrome(int x) {
        if(x < 0)
           return false;
       int cur = 0;
       int num=x;
       while(num != 0) {
           cur = cur * 10 + num % 10;
           num/= 10;
       }
       return cur == x;
   }
}