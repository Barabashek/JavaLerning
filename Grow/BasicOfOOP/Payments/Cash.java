package Grow.BasicOfOOP.Payments;

public enum Cash {
    RUB("ruble", 79.0),
    USD("dollar", 1.0),
    EUR("euro", 0.9),
    UHR("hryvnia", 27.31);
    private String name;
    private double coefficient;

    Cash(String name, double coefficient) {
        this.name = name;
        this.coefficient = coefficient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }
    public String toString(){
        return super.toString();
    }
}
