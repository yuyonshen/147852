

public class Vehicle {
    public void move(){
        System.out.println("交通工具都可以移动");
    }
}
class Train extends Vehicle{
    public void move(){
        System.out.println("火车在轨道上行驶");
    }
}
class Car extends Vehicle{
    public void move(){
        System.out.println("汽车在公路上行驶");
    }

    public static void main(String[] args) {
        Vehicle ve=new Vehicle();
        ve.move();
        Train tr=new Train();
        tr.move();
        Car car=new Car();
        car.move();
    }
}
