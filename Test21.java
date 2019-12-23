//、计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
/*public class Test21{    
     public static void main(String[] args) {
    double ret= func(100);
    System.out.println(ret);
}
 public static double func(int n) {
    double sum = 0.0;
    int flag =1;
    for (int i = 1; i < n ; i++) {
         sum += 1.0/ i * flag;//注意 不能是1/i*flag sum为double类型
        flag = - flag;
    }
    return sum;
}
}*/
public class Test21{
    public static void main(String[] args) {
        double num=0;
        double ret1=0.0;
        for(int i=1;i<100;i+=2){
            num+=1/i;
           
        }
    System.out.println(num);
    }
}
