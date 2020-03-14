public class SystemUtil {
    public static boolean isAdmin(String userId){
        //return userId.toLowerCase().equals("admin");
        return  userId.toLowerCase()=="admin";
        //氙灯比较的是身份,不是一样不一样
    }
    public static void main(String[] args){
        System.out.println(isAdmin("Admin"));
    }
}
