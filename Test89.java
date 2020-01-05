class SeqList{
    private int[] arr=new int[100];
    private int size=0;

    public int getSize(){//获取长度
        return size;
    }
    //打印顺序表
    public void display(){
        String result="[";
        for(int i=0;i<size;i++){
            result+=arr[i];
            if(i<size-1){
                result+=",";
            }
        }
        result+="]";
        System.out.println(result);
    }
   //在pos位置上增添元数
    public void add(int pos,int date){
        if(pos<0||pos>size){
            return ;
        }if(size>=arr.length){
            int[] newarr=new int[2*arr.length];
            for(int i=0;i<arr.length;i++){
                newarr[i]=arr[i];
            }
            arr=newarr;
        }if(pos==size){
            arr[pos]=date;
            size++;
            return;
        }
        for (int i = size - 1; i >= pos; i--) {
            arr[i + 1] =arr[i];
        }
        arr[pos] =date;
        size++;
    }
    //判断师傅包含某个元数
    public boolean contains(int toFind) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    //查找某个元数对应的位置
    public int search(int toFind){
        for(int i=0;i<size;i++){
            if(arr[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    //获取pos 位置的元数
    public int getPos(int pos){
        for(int i=0;i<size;i++){
            if(arr[i]==arr[pos]){
                return arr[i];
            }
        }
        return -1;
    }
    //给pos位置上元数设为value
    public void setPos(int pos, int data) {
        arr[pos] = data;
    }
    //删除第一吃出现的关键字key
    public void remove(int toRemove){
        int pos=search( toRemove);
        if(pos==-1){
            return;
        }if(pos==size-1){
            size--;
            return;
        }
        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }
    //获取顺序表长度
    public int size(){
        return size;
    }
    //清空顺序表
    public void clear(){
        size=0;
    }
}

public class Test89 {
    private static  void testadd(){
        SeqList seqList = new SeqList();
        seqList.add(0,1);
        seqList.add(0,2);
        seqList.add(0,3);
        seqList.add(0,4);
        seqList.display();
    }
    private static  void testContains(){
        SeqList seqList = new SeqList();
        seqList.add(0,1);
        seqList.add(0,2);
        seqList.add(0,3);
        seqList.add(0,4);
        System.out.println(seqList.contains(4));
    }
    private static  void testSearch(){
        SeqList seqList = new SeqList();
        seqList.add(0,1);
        seqList.add(0,2);
        seqList.add(0,3);
        seqList.add(0,4);
        System.out.println(seqList.search(3));
    }
    private static  void testGetpos(){
        SeqList seqList = new SeqList();
        seqList.add(0,1);
        seqList.add(0,2);
        seqList.add(0,3);
        seqList.add(0,4);
        System.out.println(seqList.getPos(1));
    }
    private static void testRemove(){
        SeqList seqList = new SeqList();
        seqList.add(0,1);
        seqList.add(0,2);
        seqList.add(0,3);
        seqList.add(0,4);
        seqList.remove(2);
        seqList.display();
    }

    public static void main(String[] args) {
       // testadd();
        //testContains();
        //testSearch();
        //testGetpos();
        testRemove();
    }
}
