import java.util.Scanner;

public class Tomato {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("今天的西红柿单价（单价格式3.00）：");
        String dayPrice=scanner.next();
        if(dayPrice.length()==4){
            try{
                String message="西红柿"+dayPrice+"元/500";
                String[] strArr=message.split(":");
                String unitPriceStr=message.substring(3,7);
                double weight=650;
                double unitPriceDou=Double.parseDouble(unitPriceStr);
                System.out.println(message+",顾客买了"+weight+"克西红柿，需支付"+
                        (float)(weight/500*unitPriceDou));
            }catch(ArrayIndexOutOfBoundsException aiobe){
                //扑捉数组袁术下表越界异常对象
                aiobe.printStackTrace();
            }catch(Exception e){
                //扑捉以与以产生的异常类型相匹配的异常对象
                e.printStackTrace();
            }finally{
                scanner.close();//关闭控制太输入对象
                System.out.println("控制台输入对象被关闭");
            }
        }else{
            System.out.println("操作违规："+"输入西红柿单价时小数点后面必须保留两位有效数字（如3.00）！");
        }
    }
}
