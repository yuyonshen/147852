package Java;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class SeqList {
    private int[] datas=new int[100];
    private int size=0;

    public int getSize(){
        return size;
    }
    //打印每个元素
    public void display(){
        String result="[";
        for(int i=0;i<size;i++){
            result+=datas[i];
            if(i<size-1){
                result+=" , ";
            }
        }
        result+="]";
        System.out.println(result);
    }
   //在pos心新增加元素
    public void add(int pos,int data){
        //先判断pos是否有效
        if(pos<0||pos>size){
            return ;
        }
        if(pos>=datas.length){
            int[] newDatas=new int[2*datas.length];
            for(int i=0;i<datas.length;i++){
                newDatas[i]=datas[i];
            }
            datas=newDatas;
        }
        //判断pos是否在尾端
        if(pos==size){
            datas[size]=data;
            size++;
            return ;
        }
        //插入普通为位置；
        for(int i=pos+1;i<size;i++){
            datas[i+1]=datas[i];
        }
        datas[pos]=data;
        size++;
    }
    //判断是否包含这个元素
    public boolean contains(int toFind){
        for(int i=0;i<size;i++){
            if(datas[i]==toFind){
                return true;
            }
        }
        return false;
    }
    //查找某元素对应的位置
    public int search(int toFind){
        for(int i=0;i<size;i++){
            if(datas[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    //获取某元素的位置
    public int getPos (int pos){
        return datas[pos];
    }
    //给pos位置上的元素设为value
    public void setPos(int pos, int data) {
        datas[pos] = data;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove){
        int pos=search(toRemove);
        if(pos==-1){
            return;
        }
        //如果删除最后一个元数
        if(pos==size-1){
            size--;
            return;
        }
        //如果中间元素
        for(int i=pos;i<size;i++){
            datas[i]=datas[i+1];
        }
        size--;
    }
    //清除顺序表
    public void clear(){
        size=0;
    }
}
