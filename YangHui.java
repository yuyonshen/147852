import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YangHui {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> result=new ArrayList<>();
        if(numRows<=0){
         return new ArrayList<>();
        }
        //创建第一行元素
        List<Integer> first=new ArrayList<>();
        first.add(1);
        result.add(first);
        //当numRows==1时,返回1;
        if(numRows==1){
            return result;
        }
        //创建第二行元素
        List<Integer> Second=new ArrayList<>();
        Second.add(1);
        Second.add(1);
        result.add(Second);
        //判断numRows==2,返回2;
        if(numRows==2){
            return result;
        }
        //numRows>3时需要循环;
        for(int i=3;i<numRows;i++){
            List<Integer> prv=result.get(i-1-1);
            List<Integer> cur=new ArrayList<>();
            cur.add(1);
            for(int j=2;j<i;j++){
                int num=prv.get(j-1)+prv.get(j-1-1);
                cur.add(num);
            }
            cur.add(1);
            result.add(cur);

        }
        return result;
    }
}
