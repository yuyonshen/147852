public class java1_15_4 {//查找车牌号
    public static void main(String[] args) {
        String plat[]={"xx56841","xx48969","xx04103","xx69310",
        "xx97211","xx53184","xx30014","xx79824"};
        String number="4";
        for(int i=0;i<plat.length;i++){
            if(plat[i].endsWith(number)){
            System.out.println(plat[i]+" ");
        }

        }
    }
}
