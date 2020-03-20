package java3_20_2;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Ranking2 {
    public static void main(String[] args) {


        String[] teams = {"伊朗", "韩国", "日本", "澳大利亚", "沙特阿拉伯", "乌兹别克斯坦",
                "阿拉伯联合酋长国", "卡塔尔", "中国", "叙利亚"};
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 0; i < teams.length; i++) {
            map.put(i + 1, teams[i]);
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("一次输入的名词查询亚足联盘面的前10只球队");
        try{
            int number=scanner.nextInt();
            if(number>0&&number<=10){
                System.out.println("亚足联排名第"+number+"的男足国家队是"+map.get(number)+"");
                scanner.close();
            }else{
                System.out.println("输入错误");
            }
        }catch (InputMismatchException e){
            System.out.println("输入错误");
        }
    }
}
