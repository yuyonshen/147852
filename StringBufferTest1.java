public class StringBufferTest1 {
    public static void main(String[] args) {

    
    StringBuffer sbf=new StringBuffer("15319368550");
    StringBuffer tmp=sbf.replace(3,6,"****");
    System.out.println(tmp);
}
}
