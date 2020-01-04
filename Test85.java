//class Change{
//  private int num1=10;
//    private int num2=20;
//
//    public int getNum1() {
//        return num1;
//    }
//
//    public void setNum1(int num1) {
//        this.num1 = num1;
//    }
//
//    public int getNum2() {
//        return num2;
//    }
//
//    public void setNum2(int num2) {
//        this.num2 = num2;
//    }
//    public void show(){
//        System.out.println("num1="+num1+" num2="+num2);
//    }
//}
//public class Test85 {
//
//    public static void main(String[] args) {
//
//    Change change =new Change();
//    change.setNum1(20);
//    change.setNum2(10);
//    change.show();
//    }
//}
public class Test85{
public static void main(String[]args){
    int num1=10;
    int num2=20;
    int tmp;
    tmp=num1;
    num1=num2;
    num2=tmp;
    System.out.println(num1);
    System.out.println(num2);
    }
}
