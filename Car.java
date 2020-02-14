public class Car {
    private String brand;
    public Car(String brand){
        this.brand=brand;
    }
    private void start(){
        System.out.println("启动"+this.brand);
    }
    class Engine{
        private String model;
        public Engine(String model){
            this.model=model;
        }
        private void ignite(){
            System.out.println("发动机"+this.model+"点火");
        }
    }

    public static void main(String[] args) {
        Car car=new Car("大众朗行");
        car.start();
        Car.Engine engine=car.new Engine("EA211");
        engine.ignite();
    }
}
