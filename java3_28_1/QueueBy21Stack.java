package java3_28_1;

import sun.nio.cs.ext.ISCII91;

import java.util.Stack;

public class QueueBy21Stack {
    Stack<Integer> A=new Stack<>();
    Stack<Integer> B=new Stack<>();
    //压栈B栈石佛语为空,如果不为空,将B栈中的元素压入A栈中.
    public void push(int v){
       //判断
        while(!B.empty()){
           int temp=B.push(v);
           A.push(temp);
       }
       A.push(v);
    }
   // 出栈
    public Integer pop(){
        if(A.empty()){
            return null;
        }
        while(!A.empty()) {
        int num=A.pop();
        B.push(num);
        }
        return B.pop();
    }
    //获取栈顶元素
    public Integer peek(){
        if(A.empty()){
            return null;
        }
        while(!A.empty()){
            int num=A.pop();
            B.push(num);
        }
        return B.pop();
    }
    //判断栈是否为空
    public boolean isEmpty(){
        return A.empty()&&B.empty();
    }
}
