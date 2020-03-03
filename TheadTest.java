public class TheadTest extends Thread {
    private int count=10;
    public void run(){
        while(true){
            System.out.println(count+" ");
            if(--count==0){
                break;
            }
        }
    }

    public static void main(String[] args) {
        TheadTest test=new TheadTest();
        test.start();
    }

}
