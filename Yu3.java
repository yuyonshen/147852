public class Yu3{
    public static int count=0;
    
    public static void main(String[] args) {
        System.out.println(fit(40));
        System.out.println(count++);
    }
    public static int fit(int n){
        
        if(n==1||n==2){
           return 1;
        }if(n==3){
            count++;
        }
       return fit(n-1)+fit(n-2);
    }
}