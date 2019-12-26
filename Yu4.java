public class Yu4{
    public static void main(String[] args) {
        int n=40;
        System.out.println(fit(40));
    }
    public static int fit(int num){
        int last1=1;
        int last2=1;
        int cur=0;
        for(int i=3;i<=num;i++){
            cur=last1+last2;
            last2=last1;
            last1=cur;
        }
        return cur;
    }
}