import java.util.Scanner;

class PriceException extends Exception{
    public PriceException(String message){
        super(message);
    }
}


public class Tomate3 {
    private double price;
    //获取西红柿单价
    public double getPrice(){
        return price;
    }
public void setPrice(double price) throws PriceException{
        if(price>7.0){
            throw new PriceException("国家规定西红柿单价不得大于7元");
        }else{
            this.price=price;
        }
}
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("今天的西红柿单价（单价格式为“3.00”）：");
        String dayPrice =scanner.next();
        if(dayPrice.length()==4){
            double unitPriceDou=Double.parseDouble(dayPrice);
            Tomate3 tomate=new Tomate3();
            try{
                tomate.setPrice(unitPriceDou);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }finally{
                scanner.close();
            }
        }else{
            System.out.println("违规操作"+"输入西红柿单价是小数点后必须保留两位有效小数");
        }
    }
}
