package ListTest;

import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        //第一个序列为压入栈的序列
        //第二个序列为弹出栈的序列
        if(pushA.length==0||popA.length==0||pushA.length!=popA.length){
            return false;
        }
        Stack<Integer> stack=new Stack<>();
        int j=0;
        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while(!stack.isEmpty()&&stack.peek()==popA[j]){
                stack.pop();
                j++;
            }
        }
            return stack.isEmpty();
    }
    //给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，
    // 判断二者是否相等，并返回结果。 # 代表退格字符。
    public boolean backspaceCompare(String S, String T) {
        //使用了个栈来比较
        Stack<Character> A=new Stack<>();
        Stack<Character> B=new Stack<>();
        if(A==null&&B==null){
            return true;
        }
        for(char a: S.toCharArray()){
            if(a!='#'){
                A.push(a);
            }else if(!A.isEmpty()){
                A.pop();
            }
        }
        for(char b:T.toCharArray()){
            if(b!='#'){
                B.push(b);
            }else if(!B.isEmpty()){
                B.pop();
            }
        }
        String C=String.valueOf(A);
        String D=String.valueOf(B);
        return C.equals(D);
    }


}
