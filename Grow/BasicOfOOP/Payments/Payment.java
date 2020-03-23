package Grow.BasicOfOOP.Payments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Payment {
    private Check check;
    private Cash cash;
    private double balance;

    public Payment(Cash cash, Commodity ... com) {
        List<Commodity> commodities = new ArrayList<>();
        Collections.addAll(commodities, com);
        check = new Check(commodities);
        this.cash = cash;
        int buff = (int)(check.getBalance() * cash.getCoefficient()*100);
        balance = (double) buff / 100;
        System.out.printf("Check total: %.2f $s. Pay in %ss.\n", check.getBalance(), "dollar", cash.getName());
        System.out.printf("Needed to pay %.2f %ss.\n", balance, cash.getName());
    }

    public void doPayment(Cash cash, double amountMoney){
        if (balance < amountMoney){
            System.out.printf("Paid %.2f %ss.\n", amountMoney, cash.getName());
            double newBalance = amountMoney - balance;
            System.out.printf("New balance: %.2f %ss.\n", newBalance, cash.getName());
        } else if (balance == amountMoney){
            System.out.printf("Paid %.2f %ss.\n", amountMoney, cash.getName());
            System.out.println("Thank you for paying");
        }else {
            System.out.printf("Paid %.2f %ss.\n", amountMoney, cash.getName());
            balance -= amountMoney;
            System.out.printf("Purchase amount: %.2f %ss.\n", balance, this.cash.getName());
        }

    }

    public static class Check{
        private ArrayList<Commodity> commodities;
        private double balance;

        public Check(List<Commodity> commodities) {
            this.commodities = (ArrayList<Commodity>) commodities;
            balance = getAllPrice();
        }
        public double getAllPrice(){
            double allPrice = commodities.stream().mapToDouble(Commodity::getPrice).sum();
            return allPrice;
        }
        public void addCommodity(Commodity commodity){
            commodities.add(commodity);
        }
        public void removeCommodity(Commodity commodity){
            commodities.remove(commodity);
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
        public String toString(){
            return "Cash{" +
                    "commodity=" + commodities +
                    ", balance=" + balance +
                    '}';
        }
    }
}
