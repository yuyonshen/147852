package java3_28_1;

import java.util.Stack;

public class MinStack {

Stack<Integer> A=new Stack<>();
Stack<Integer> B=new Stack<>();
    public void push(int x) {
        A.push(x);
        if(B.empty()){
            B.push(x);
            return ;
        }
        int min=B.peek();
        if(x>min){
            x=min;
        }
        B.push(x);
    }

    public Integer pop(){
        if(A.isEmpty()){
            return null;
        }
        B.pop();
        return A.pop();
    }

    public Integer top() {
        if(A.isEmpty()){
            return null;
        }
        return A.peek();
    }

    public Integer getMin() {
        if(A.empty()){
            return null;
        }
        return B.peek();
    }
}
