//输出 1000 - 2000 之间所有的闰年 
public class Test17{
    public static void main(String[] args) {
        int year;
        for(year=1000;year<=2000;year++){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year);
                }
            }else{
                if(year%4==0){
                    System.out.println(year);
                }
            }
        }
        }
    }
