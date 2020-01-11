package Java;


public class Seqlist {
    private int[] datas=new int[100];
    private int size=0;

    public int getSize(){
    return size;
}
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

    public void add(int pos,int data){
        if(pos<0||pos>size){
            return ;
        }
       if(size>datas.length) {
           int[] newDatas = new int[2 * datas.length];
            for(int i=0;i<datas.length;i++){
                newDatas[i]=datas[i];
            }
            datas=newDatas;
       }
       if(pos==size){
           datas[pos]=data;
           size++;
           return ;
       }
    }
    public boolean contians(int toFind){
        for(int i=0;i<size;i++){
            if(datas[i]==toFind){
                return true;
            }
        }
        return false;
    }
    public int search(int toFind){
        for(int i=0;i<size;i++){
            if(datas[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    public int getPos(int pos){
        return datas[pos];
    }

    public int setPos(int pos,int data){
        return datas[pos]=data;
    }

    public void remove(int toRemove){//删除元素
        int pos=search(toRemove);
        if(pos==-1){
            return ;
        }
        if(pos==size){
            size--;
            return ;
        }
        for(int i=pos;i<size-1;i++){
            datas[i]=datas[i+1];

        }
        size--;
    }

    public void clear(){
        size=0;


    }

}
