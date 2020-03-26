package java3_26_1;

import java.util.ArrayList;
import java.util.List;

public class YangHui {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> result=new ArrayList<>();
        if(numRows<=0){
            return new ArrayList<>();
        }
        List<Integer> frist=new ArrayList<>();
        frist.add(1);
        result.add(frist);
        if(numRows==1){
            return result;
        }
        List<Integer> second=new ArrayList<>();
        second.add(1);
        second.add(1);
        result.add(second);
        if(numRows==2){
            return result;
        }
        for(int i=3;i<numRows;i++){
            //上一列的元素
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
