//计算阶乘相加
public class Test36{
    public static void main(String[] args) {
        int number=5;
        int ret=Add(5);
        System.out.println(ret);
    }
    public static int Forter(int n){
        int num=1;
        
        for(int i=1;i<=n;i++){
            num=num*i;
        }
        return num;
    }
    public static int Add(int n){
        int add;
        int num=0;
        for(int i=1;i<=n;i++){
           add= Forter(i);
            num+=add;
        }
       
        return num;
    }
}