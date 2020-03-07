package java3_7_3;

import java.io.FileWriter;

public class AnimalTast {
    public static void main(String[] args) {
        Animal animal=new Frog("青蛙");
        Frog frog=(Frog)animal;
        frog.run();
        frog.swim();
    }
}
