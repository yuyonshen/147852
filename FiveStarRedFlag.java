public final class FiveStarRedFlag {
    int starNum;
    String starColor;
    String backgroundColor;
    public FiveStarRedFlag(int starNum,String starColor,String backgroundColor){
        this.starNum=starNum;
        this.starColor=starColor;
        this.backgroundColor=backgroundColor;
    }

    public static void main(String[] args) {
            FiveStarRedFlag flag=new FiveStarRedFlag(5,"黄色","红色");
        System.out.println("五星红旗是由"+flag.backgroundColor+"的旗面和"+flag.starNum
                            +"颗"+flag.starColor+"的五角星组成的");
    }
}
