//编写程序数一下 1到 100 的所有整数中出现多少个数字9 
public class Test18{
    public static void main(String[] args) {
    int num;
    for(num=1;num<=100;num++){
        if(num<10){
            if(num==9){
                System.out.println(num);
            }
        }else{
            if(num%10==9||num/10==9){
                System.out.println(num);
            }
        }
    }
    }
}