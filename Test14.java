//根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
import java.util.Scanner;
public class Test14{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        if(year<18){
            System.out.printf("少年");
        }else if(year<=18&&year<28){
            System.out.printf("青年");

        }else if(year<=29&&year<55){
            System.out.printf("中年");
        }else{
            System.out.printf("老年");
        }
    }
}