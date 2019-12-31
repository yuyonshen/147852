//调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
public class Test35{
    public static void main(String[] args) {
        int[] arr={23,456,234,78,234,654,87,89,67,34};
        int i;
        int j;
        int tmp;
        for(i=0;i<9;i++){
            for(j=i+1;j<10;j++){
                if(arr[j]%2!=0){
                    tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    for(i=0;i<10;i++){
        if(i==5){
            System.out.printf("\n");
        }    
        System.out.printf("%d\t",arr[i]);
    }
        
}


}