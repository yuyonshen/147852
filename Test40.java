//、递归求 1 + 2 + 3 + ... + 10 
public class Test40{
    public static void main(String[] args) {
        System.out.println(Add(10));
    }
    public static int Add(int n){
        if(n==1){
            return 1;
        }
        return n+Add(n-1);
    }
}