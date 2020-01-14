public class Test101{
    public static void main(String[] args) {
        
    } 
        public int[] sortArrayByParity(int[] A) {
            int left=0;
            int rigth=A.length-1;
            while(left<rigth){
                if(left<rigth&&A[left]%2==0){
                    left++;
                }if(left<rigth&&A[rigth]%2!=0){
                    rigth--;
                }else{
                    int tmp=A[left];
                        A[left]=A[rigth];
                        A[rigth]=tmp;
                }
            }
            return A;
    
}