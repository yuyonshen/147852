public class Pool2 {
    public static int water=0;
    public static void outlet(){
        if(water>=2){
            water=water-2;
        }else{
            water=0;
        }
    }
    public static void inlet(){
        water=water+3;
    }

    public static void main(String[] args) {
        System.out.println("水池的水量："+Pool2.water);
        System.out.println("水池注两次水。");
        Pool2.inlet();
        Pool2.inlet();
        System.out.println("水池说的水量："+Pool2.water);
        System.out.println("水池放一次水：");
        Pool2.outlet();
        System.out.println("水池的水量"+Pool2.water);
    }
}
