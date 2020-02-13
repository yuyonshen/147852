//定义一个“爸爸喜欢做的事”接口
interface DadLikeDo{
    void smoke();
    void fish();
}
//定义一个“妈妈喜欢做的事”接口
interface MonLikeDo{
    void watchTV();
    void cook();
}
public class SonLikeDo implements DadLikeDo , MonLikeDo {
    public void watchTV(){
        System.out.println("看电视");
    }
    public void cook(){
        System.out.println("做饭");
    }
    public void smoke(){
        System.out.println("抽烟");
    }
    public void fish(){
        System.out.println("钓鱼");
    }

    public static void main(String[] args) {
        SonLikeDo son=new SonLikeDo();
        System.out.println("儿子喜欢做的事");
        son.watchTV();
        son.cook();
        son.fish();
        son.smoke();
    }
}
