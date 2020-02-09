public class ExchangeRate {
    public static void main(String[] args) {
        ExchangeRate rate=new ExchangeRate();
        double[] denomination={1,10,100};
        System.out.print("美元： ");
        for(int i=0;i<denomination.length;i++) {
            System.out.print(denomination[i]+"美元 ");
        }
        rate.change(denomination);
        System.out.print("\n人名币： ");
        for(int j=0;j<denomination.length;j++){
            System.out.print(denomination[j]+"元 ");
        }
    }
    public void change(double[] i){
        for(int j=0;j<i.length;j++){
            i[j]=i[j]*6.903;
        }
    }
}
