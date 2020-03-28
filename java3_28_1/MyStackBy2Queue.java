package java3_28_1;

import sun.rmi.server.InactiveGroupException;

import java.util.LinkedList;
import java.util.Queue;

public class MyStackBy2Queue {
    Queue<Integer> A=new LinkedList<>();
    Queue<Integer> B=new LinkedList<>();
    //压栈
    public void push(int x) {
        A.offer(x);
    }

    //出栈
    public Integer pop() {
        if(empty()){
            return null;
        }
        while(A.size()>1){
            Integer num=A.poll();
            B.offer(num);
        }
        int ret=A.poll();
        swapAB();
        return ret;
    }
    public void swapAB(){
        Queue<Integer> temp=A;
        A=B;
        B=temp;
    }

    //获取栈顶元素
    public Integer top() {
        if(empty()){
            return null;
        }
        while(A.size()>1){
            Integer num=A.poll();
            B.offer(num);
        }
        int ret=A.poll();
        B.offer(ret);
        swapAB();
        return ret;
    }

    //判断栈是否为空
    public boolean empty() {
        return A.isEmpty()&&B.isEmpty();
    }

}
