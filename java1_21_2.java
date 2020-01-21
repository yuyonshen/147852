class Solut{
    //给定一组字符，使用原地算法将其压缩。
    //
    //压缩后的长度必须始终小于或等于原数组长度。
    //
    //数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
    //
    //在完成原地修改输入数组后，返回数组的新长度。
    
    public int compress(char[] chars) {
        int left=0;
        int size=0;
        for(int rigth=0;rigth<=chars.length;rigth++){
            if(rigth==chars.length||chars[left]!=chars[rigth]){
                chars[size++]=chars[left];
                if(rigth-left>1){
                    for(char c:String.valueOf(rigth - left).toCharArray()){
                        chars[size++]=c;
                    }
                }
                left=rigth;
            }

        }
        return size;
    }
}
public class java1_21_2 {
}
