package java3_6_1;

public abstract class Market {
    public String name;
    public String goods;
    public Market(String name,String goods){
        this.name=name;
        this.goods=goods;
    }
    public abstract void shop();
}
class TaoBaoMarket extends Market{
    public TaoBaoMarket(String name,String goods){
        super(name,goods);
    }
    @Override
    public void shop(){
        System.out.println(this.name+"网购"+this.goods);
    }
}
class WallMarket extends Market{
    public WallMarket(String name,String goods){
        super(name,goods);
    }
    @Override
    public void shop(){
        System.out.println(this.name+"实体店"+this.goods);
    }
}
