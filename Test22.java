//求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数“。）
public class Test22{
public static void main(String[] args) {
   int ret;
   int ret1;
   int ret2;
    for(int i=100;i<=999;i++){
       ret=i/100;//百位
       ret1=i%100/10;//十位
       ret2=i%10;//个位
       if(i==Math.pow(ret,3)+Math.pow(ret1,3)+Math.pow(ret2,3)){
           System.out.println(i);
       }
        }
        for(int i=10;i<100;i++){
            ret=i/10;
            ret1=i%10;
            if(i==Math.pow(ret,3)+Math.pow(ret1,3)){
                System.out.println(i);
            }
        }
    }
}
