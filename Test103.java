public class Test102{
    public static void main(String[] args) {
        int[] arr={-2,0,4,-10,5};
            pow(arr);        

    }
    public static void pow(int[] A){
        int length=A.length;
        int[] arr=new int[A.length];
        for(int i=0;i<length;i++){
            arr[i]=A[i]*A[i];
        }
        for(int j=0;j<length-1;j++){
            for(int z=j+1;z<length;z++){
                if(arr[j]<arr[z]){
                    int tmp=arr[j];
                    arr[j]=arr[z];
                    arr[z]=tmp;
                }
            }
        }
        for(int b=0;b<length;b++){
            System.out.println(arr[b]);
        }

    }
}