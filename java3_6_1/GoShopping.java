package java3_6_1;

public class GoShopping {
    public static void main(String[] args) {
        Market market=new WallMarket("沃尔玛","七匹狼");
        market.shop();
        market=new TaoBaoMarket("淘宝","裙子");
        market.shop();

    }
}
