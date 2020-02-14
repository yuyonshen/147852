public class Tomato {
    public static void main(String[] args) {
        try{
            String message="西红柿：2.99元/500g";
            String[] strArr=message.split(":  ");//使用”：“拆分字符串
            String unitPriceStr=message.substring(4,8);//截取西红柿单价：2.99
            double weight=650;
            //将String类型转换为double类型
            double unitPriceDou=Double.parseDouble(unitPriceStr);
            //输出顾客购买650g的西红柿需要支付的金额
            System.out.println(message+"顾客购买"+weight+"克的西红柿，需支付"
                    +(float)(weight/500*unitPriceDou)+"元");
        }catch(Exception e){//扑捉以产生的异常类型相匹配的异常对象。
            e.printStackTrace();//打印异常信息
        }
        System.out.println("程序执行完毕");
    }
}
