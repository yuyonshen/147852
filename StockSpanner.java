import java.util.Stack;

public class StockSpanner {
    Stack<Integer> prices;
    Stack<Integer> weights;
    public StockSpanner() {
        prices=new Stack<>();
        weights=new Stack<>();

    }

    public int next(int price) {
        int w=1;
        while (!prices.isEmpty() && prices.peek() <= price){
            prices.pop();
            w+=weights.pop();
        }
        prices.push(price);
        weights.push(w);
        return w;

    }
    public int evalRPN(String[] tokens) {
        //先将所有的元素入栈
        Stack<Integer> nums=new Stack<>();
        Integer op1;
        Integer op2;
        for(String s:tokens){
           switch (s){
               case "+":
                   op1=nums.pop();
                   op2=nums.pop();
                   nums.push(op1+op2);
                   break;
               case "-":
                   op1=nums.pop();
                   op2=nums.pop();
                   nums.push(op2-op1);
                   break;
               case "*":
                   op1=nums.pop();
                   op2=nums.pop();
                   nums.push(op1*op2);
                   break;
               case "/":
                   op1=nums.pop();
                   op2=nums.pop();
                   nums.push(op2/op1);
                   break;
               default:
                   nums.push(Integer.valueOf(s));
                   break;
           }
        }
        return nums.pop();
    }
}
