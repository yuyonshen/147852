import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class java3_28_1 {
    //括号匹配问题

    public boolean isValid(String s) {
        //创建一个栈将向右的括号加入到栈中
        Stack<Character> stack=new Stack<>();
    //在循环遍历如果是右括号就加入到栈中
        //也可以创建一个Map
        Map<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        for(int i=0;i<s.length();i++) {
            char A = s.charAt(i);
            if (A == '(' || A == '{' || A == '[') {
                stack.push(A);
                continue;
            }
            if (stack.empty()) {
                return false;
            }
//            char B=stack.pop();
//            if(B=='('&&A=='('){
//                continue;
//            }if(B=='{'&&A=='}'){
//                continue;
//            }if(B=='['&&A==']'){
//                continue;
//            }
//            return false;

            //       }
            char B = stack.pop();
            if (map.get(B) == A) {
                continue;
            }
            return false;
        }
        if(!stack.empty()){
            return false;
        }
        return true;
    }
}
