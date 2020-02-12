import org.omg.CORBA.MARSHAL;

abstract  class Market{
    public String name;
    public String goods;
    public abstract void shop();
}
class TaoBaoMarket extends Market{
    public void shop(){
        System.out.println(name+"网购"+goods);
    }
}
class WallMarket extends Market{
    public void shop(){
        System.out.println(name+"实体店购买"+goods);
    }
}
public class GoShopping {
    public static void main(String[] args) {
        Market market=new WallMarket();
        market.name="沃尔玛";
        market.goods="七匹狼西服";
        market.shop();
        market=new TaoBaoMarket();
        market.name="淘宝";
        market.goods="韩都衣舍花裙";
        market.shop();
    }
}
