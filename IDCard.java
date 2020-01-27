//截取省份证号中的出生年月日；
public class IDCard{

    public static void main(String[] args) {
        String idNum="12345678903254";
        String year=idNum.substring(6,10);
        String month=idNum.substring(10,12);
        String day=idNum.substring(12,14);
        System.out.println("该省份证显示的出生年月日");
        System.out.println(year+"年"+month+"月"+day+"日");
    }
}