public class Test68{
    public static void main(String[] args) {
        int password=123456;
        int key=7;
        System.out.println("原始密码"+password);
        password=password<<key;
        System.out.println("左移后的的密码"+password);
        password=password>>key;
        System.out.println("向右移还原的密码"+password);
    }
}