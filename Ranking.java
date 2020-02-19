import java.util.Map;
import java.util.InputMismatchException;
import java.util.HashMap;
import java.util.Scanner;

public class Ranking {
    public static void main(String[] args) {
        String[] teams={"伊朗","韩国","日本","澳大利亚","沙特阿拉伯",
                "乌兹别克斯坦","阿拉伯联合酋长国","卡塔尔","中国","叙利亚"};
        Map<Integer,String> map=new HashMap<Integer,String>();
        for(int i=0;i<teams.length;i++){//向map中增加元素。
            map.put(i+1,teams[i]);
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("以此输入的名次查询亚足联排名前10支球队的某一支男足国家队");
        try{
            int number=scanner.nextInt();
            if(number>0&&number<=10){
                System.out.println("亚足联名次第"+number+"的男足国家队"+map.get(number)+"");
                scanner.close();
            }else{
                System.out.println("输入错误：只能输入1-10的数字");
            }
        }catch(InputMismatchException e){
            System.out.println("输入错误：只能输入1-10之间的一个数字。");
        }
    }
}
