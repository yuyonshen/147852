public class Teacher {
    String name;
    String sex;
    int years;
    public Teacher(String name,String sex,int years){
        this.name=name;
        this.sex=sex;
        this.years=years;
    }
    public void printf(){
        System.out.println(name +","+ sex +","+ years);
    }

    public static void main(String[] args) {
        Teacher teachar=new Teacher("yuzhenghan","男",23);
        teachar.printf();
    }


}
