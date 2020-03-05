import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    Connection con;
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载完毕！");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            con= DriverManager.getConnection("jdbc:mysql:"+"//127.0.0.1:3306/test"
            ,"root","root");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        Conn c=new Conn();
        c.getConnection();
    }
}
