package Grow.BasicOfOOP.Payments;

public class Main {
    public static void main(String[] args) {
        Commodity com1 = new Commodity("TV", 100134015, 299.90);
        Commodity com2 = new Commodity("Hob", 100134029, 159.00);
        Commodity com3 = new Commodity("Steamer", 100142301, 69.99);
        Commodity com4 = new Commodity("Blender", 101023154, 25.50);
        Commodity com5 = new Commodity("PC", 100215456, 530.00);
        Commodity com6 = new Commodity("Tablet", 100215455, 190.90);

        Payment pay1 = new Payment(Cash.USD, com1, com2, com3, com4, com5, com6);
        pay1.doPayment(Cash.USD, 1500);
        pay1.doPayment(Cash.USD, 100.20);

        System.out.println("===============================");
        Payment pay2 = new Payment(Cash.RUB, com5, com6);
        pay2.doPayment(Cash.RUB, 80000);
        pay2.doPayment(Cash.RUB, 10000);

        System.out.println("===============================");
        Payment pay3 = new Payment(Cash.EUR, com1, com2, com5);
        pay3.doPayment(Cash.EUR, 1200);
    }
}
