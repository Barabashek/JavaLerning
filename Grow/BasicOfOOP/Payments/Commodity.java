package Grow.BasicOfOOP.Payments;

public class Commodity {
    private String name;
    private int codeCommodity;
    private double price;

    public Commodity(String name, int codeCommodity, double price) {
        this.name = name;
        this.codeCommodity = codeCommodity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCodeCommodity() {
        return codeCommodity;
    }

    public void setCodeCommodity(int codeCommodity) {
        this.codeCommodity = codeCommodity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String toString(){
        return String.format("%s, product code: %d, price: $ %.2f", name, codeCommodity, price);
    }
}
