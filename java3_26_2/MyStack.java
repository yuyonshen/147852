package java3_26_2;
//栈的使用
//规则是后进先出

public class MyStack {
    private int[] arr=new int[100];
    private int size=0;
    //插入元素
    public void push(int v){
        arr[size++]=v;
    }
    //删除元素
    public int pop(){
        return arr[size--];
    }
    //获取删除元素的值
    public int peek(){
        return arr[size-1];
    }
}
