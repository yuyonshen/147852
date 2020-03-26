package java3_26_2;
//循环队列
public class MyQueueByArray {
    private int[] array=new int[100];
    private int head=0;
    private int tail=0;
    private int size=0;
//元素入列
    public void offer(int v){
        if(size==array.length){
            return ;
        }
        array[tail]=v;
        tail++;
        if(tail>=array.length){
                tail=0;
        }
        size++;
    }
   //元素出列
    public Integer poll(){
        if(size==0){
            return null;
        }
        int val=array[head];
        head++;
        if(head>=array.length){
            head=0;
        }
        size--;
        return val;
    }
   //获取首元素
    public Integer peek(){
        if(size==0){
            return null;
        }
        return array[head];
    }

}
