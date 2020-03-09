package Book;

public class Book {
    //创建书的属性
    private String name;
    private String zuozhe;
    private int jiage;
    private String leiixng;
    private boolean zaibuzai;


    public Book(String name, String zuozhe, int jiage, String leiixng, boolean zaibuzai) {
        this.name = name;
        this.zuozhe = zuozhe;
        this.jiage = jiage;
        this.leiixng = leiixng;
        this.zaibuzai = zaibuzai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZuozhe() {
        return zuozhe;
    }

    public void setZuozhe(String zuozhe) {
        this.zuozhe = zuozhe;
    }

    public int getJiage() {
        return jiage;
    }

    public void setJiage(int jiage) {
        this.jiage = jiage;
    }

    public String getLeiixng() {
        return leiixng;
    }

    public void setLeiixng(String leiixng) {
        this.leiixng = leiixng;
    }

    public boolean isZaibuzai() {
        return zaibuzai;
    }

    public void setZaibuzai(boolean zaibuzai) {
        this.zaibuzai = zaibuzai;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", zuozhe='" + zuozhe + '\'' +
                ", jiage=" + jiage +
                ", leiixng='" + leiixng + '\'' +
                ", zaibuzai=" + zaibuzai +
                '}';
    }
}
