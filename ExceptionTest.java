import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {


//
        //      int[] arr = {1, 2, 3, 4};
//        try {
//            System.out.println("before");
//            arr=null;
//            System.out.println(arr[100]);
//            System.out.println("after");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//           // System.out.println("数组越界");
//        }
//        System.out.println("after try catch");
//catch可以有多个
//        int[] arr={1,2,3};
//        try{
//            System.out.println("before");
//            arr=null;
//            System.out.println(arr[100]);
//            System.out.println("after");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("数组下表越界");
//            e.printStackTrace();
//        }catch(NullPointerException e1){
//            System.out.println("这是一个空指针");
//            e1.printStackTrace();
//        }
//        System.out.println("after try catch");
//
        //也可以使用一个catch捕捉多个异常(不推荐)
//        int[] arr={1,2,3};
////        try{
////            System.out.println("before");
////            arr=null;
////            System.out.println(arr[100]);
////            System.out.println("aften");
////        }catch (Exception e){
////            e.printStackTrace();
////        }finally{
////            System.out.println("finally code");
////        }
////        System.out.println("atfer try catch");

//        try (Scanner scanner = new Scanner(System.in)) {
//            int num = scanner.nextInt();
//            System.out.println("num=" + num);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //调用栈向上传递
        try{
            func();

        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("after try catch");
    }
    public static void func(){
        int arr[]={1,2,3,4};
        System.out.println(arr[100]);
    }
}
