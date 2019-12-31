//在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，
//还可以求两个小数的最大值，以及两个小数和一个整数的大小关系。
import java.util.Scanner;
public class Test34{
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        double num3=scanner.nextFloat();
        double num4=scanner.nextFloat();
        int ret1=Max(num1,num2);
        System.out.println("ret1="+ret1);
        double ret2=Max(num3,num4);
        System.out.println("ret2="+ret2);
        double ret3=Size(num3,num4,num1);
    }
    public static int Max(int num1,int num2){
        int max;
        if(num1>num2){
            max=num1;
            return max;
        }else{
            max=num2;
            return max;
        }
        
    }
    public static double Max(double num3,double num4){
        double max;
        if(num3>num4){
            max=num3;
           return max;
        }else{
            max=num4;
           return max;
        }
      
    }
    public static double Size(double num3,double num4,int num1){
        double max;
        double  min;
        if(num3>num4){
            if(num3>num1){
                max=num3;
                min=num4;
            }else{
                max=num1;
                min=num4;
            } 
        }
        else{
            if(num1>num4){
                max=num1;
                min=num3;
            }else{
                if(num3>num1){
                    max=num4;
                    min=num1;
                }else{
                    max=num4;
                    min=num3;
                }
            }
        }
        System.out.printf("max="+max);
        System.out.printf("min="+min);
        return 0;
    }
}