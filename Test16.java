//3、打印 1 - 100 之间所有的素数 
public class Test16{
    public static void main(String[] args) {
       int i;
       int j;
       
       for(i=3;i<101;i++){ 
        int k=0; 
        for(j=2;j<i;j++){
             
            if(i%j==0){
                  k++;
                }
            }
            if(k==0){
                System.out.println(i);
            }
        }
    }
}