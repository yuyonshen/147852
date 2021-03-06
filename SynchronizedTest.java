public class SynchronizedTest implements Runnable {
    int num=10;
    synchronized void f(){
        if(num>0){
            try{
                Thread.sleep(100);

            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"--票数"+num--);
        }
    }
    public void run() {
        while (true) {
            f();
        }
    }
    public static void main(String[] args) {
        SynchronizedTest t=new SynchronizedTest();
        Thread tA=new Thread(t,"线程一");
        Thread tB=new Thread(t,"线程二");
        Thread tC=new Thread(t,"线程三");
        Thread tD=new Thread(t,"线程四");
        tA.start();
        tB.start();
        tC.start();
        tD.start();
    }
}
