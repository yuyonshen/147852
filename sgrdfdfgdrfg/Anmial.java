package sgrdfdfgdrfg;

public class Anmial {

        private String name;
        public String sex;
        public int age;
        public String colour;

        public Anmial() {
            System.out.println("Hello");
        }

        public Anmial(String name, String sex, int age, String colour) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.colour = colour;
        }
    public void SHUCHU(){
        System.out.println("这个人动物叫"+name+"性别"+sex+"年龄"+age+"颜色"+colour);
        System.out.println("这个人动物叫"+name+"性别"+sex+"年龄"+age+"颜色"+colour);

    }



    public static void main(String[] args) {
        Anmial anmial=new Anmial();
        anmial.name="余振晗";
        anmial.age=23;
        anmial.sex="女";
        anmial.colour="黄色";
        anmial.SHUCHU();



    }


}
