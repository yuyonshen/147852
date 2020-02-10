//静态变量
public class Pool {
    //初始化静态变量之水池中的水量为0
    public static int water=0;
    public void outlet(){
        if(water>=2){
            water=water-2;
        }else{
            water=0;
        }
    }
    public void inlet(){
        water=water+3;
    }

    public static void main(String[] args) {
        //创建水池对象
        Pool pool=new Pool();
       //调用静态变量时的语法是：类名.静态类成员；
        System.out.println("水池的水量："+Pool.water);
        System.out.println("水池注水两次");
        pool.inlet();
        pool.inlet();
        System.out.println("水池的水量："+Pool.water);
        System.out.println("水池放水一次。");
        pool.outlet();
        System.out.println("水池的水量："+Pool.water);
    }
}
