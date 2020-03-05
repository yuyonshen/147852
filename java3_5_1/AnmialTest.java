package java3_5_1;

public class AnmialTest {
    public static void main(String[] args) {
        Animal animal = new Animal("圆圆");
        animal.eat("谷子");
        Animal animal2 = new Bird("扁扁");
        animal2.eat("谷子");
        Bird bird=(Bird)animal2;
        bird.fly();
//        Shape shape1 = new Flower();
//        Shape shape2 = new Cycle();
//        Shape shape3 = new Rect();
//        shape1.draw();
//        shape2.draw();
//        shape3.draw();
    }
}

 //public static void drawShapes() {
//        Rect rect=new Rect();
//        Flower flower=new Flower();
//        Cycle cycle=new Cycle();
//        String[] shapes={"cycle","rect","flower"};
//        for(String shape:shapes){
//            if(shape.equals("cycle")){
//                cycle.draw();
//            }else if(shape.equals("rect")){
//                rect.draw();
//            }else if(shape.equals("flower")){
//                flower.draw();
//            }
//        }
//    }
//        Shape[] shapes={new Cycle(),new Rect(),new Flower()};
//        for(Shape shape:shapes){
//            shape.draw();
//        }
//    }
//    public static void main(String[] args) {
//        drawShapes();
//    }
//}
