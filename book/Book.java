package book;

public class Book {
    private String name;
    private String zuozhe;
    private int jiage;
    private String neixing;
    private boolean zaibuzai;

    public Book(String name, String zuozhe, int jiage, String neixing, boolean zaibuzai) {
        this.name = name;
        this.zuozhe = zuozhe;
        this.jiage = jiage;
        this.neixing = neixing;
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

    public String getNeixing() {
        return neixing;
    }

    public void setNeixing(String neixing) {
        this.neixing = neixing;
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
                ", neixing='" + neixing + '\'' +
                ", zaibuzai=" + zaibuzai +
                '}';
    }
}
