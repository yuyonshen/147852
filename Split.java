public class Split {
    public static void main(String[] args) {
        String a = "松江，卢俊义，林春，鲁智深，武松";
        String b = "及时雨，玉麒麟，豹子头，花和尚，行者";
        String c[] = a.split(",");
        String d[] = b.split(",");
        String n,m;
        for (int i = 0; i < c.length; i++) {
             n=c[i];
        }
        for(int j=0;j<d.length;j++){
            m=d[j];
        }
        System.out.println();
    }
}