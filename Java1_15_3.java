public class Java1_15_3 {
    public static void main(String[] args) {
     String app[]={"美的电磁炉","海尔冰箱","格力空调","小米手机","海尔洗衣机","美的吸尘器",
             "格力手机","海尔电热水器","海信电视机"};
     int sum=0;
     for(int i=0;i<app.length;i++) {
         String name = app[i];
         if (name.startsWith("海尔")) {
             sum++;
         }
     }
        System.out.println("海尔出现的次数"+sum);
    }


}