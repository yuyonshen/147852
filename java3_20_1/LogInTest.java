package java3_20_1;

import java.util.Scanner;

public class LogInTest {
    private static  String userName="admin";
    private static  String password="123456";

    public static void login(String userName,String password) throws UserError, PasswordError {
        if(!LogInTest.userName.equals(userName)){
            throw new UserError("用户名错误");
        }
        if(!LogInTest.password.equals(password)){
            throw new PasswordError("密码错误");
        }
        System.out.println("登录成功");
    }

    public static void main(String[] args) {
        try{
            Scanner scanner =new Scanner(System.in);
            System.out.println("请输入用户名");
            String name=scanner.next();
            System.out.println("请输入密码");
            String pass=scanner.next();
            login(name,pass);
        }catch (UserError userError){
            userError.printStackTrace();
        }catch(PasswordError passwordError){
            passwordError.printStackTrace();
        }
    }
}
