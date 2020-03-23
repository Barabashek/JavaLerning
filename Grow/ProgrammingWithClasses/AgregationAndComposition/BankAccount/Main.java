package Grow.ProgrammingWithClasses.AgregationAndComposition.BankAccount;

public class Main {
    public static void main(String[] args) {
        Bank someBank = new Bank("American Express");

        Client john = new Client("John", "GoodSpick", "554-012-568");
        Client paul = new Client("Paul", "Rogers", "462-879-254");
        Client mike = new Client("Mike", "Kovalsky", "954-113-787");

        someBank.addClient(john);
        someBank.addClient(paul);
        someBank.addClient(mike);

        john.addAccount(new Account(452123548, 25000.50));
        john.addAccount(new Account(541324566, -5000.23));
        john.addAccount(new Account(845655546, 1500.21));

        paul.addAccount(new Account(420021545, 105000.15));
        paul.addAccount(new Account(562031245, 84562.00));
        paul.addAccount(new Account(989521001, -15000.12));

        mike.addAccount(new Account(858212423, 1500000.00));
        mike.addAccount(new Account(525123546, 250000.00));
        mike.addAccount(new Account(555641257, 254560.98));

        System.out.println(someBank.getBankName());

        System.out.println(someBank.getClient("554-012-568").findAccount(2).status());
        someBank.getClient("554-012-568").lockAccount(2);
        System.out.println(someBank.getClient("554-012-568").findAccount(2).status());

        System.out.println();
        System.out.println(someBank.getClient("462-879-254").printAccount());
        someBank.getClient("462-879-254").sortAccount();
        System.out.println(someBank.getClient("462-879-254").printAccount());
        someBank.getClient("954-113-787").sortAccount();
        System.out.println(someBank.getClient("954-113-787").printAccount());
        someBank.getClient("554-012-568").sortAccount();
        System.out.println(someBank.getClient("554-012-568").printAccount());

        System.out.printf("Client %s %s has %s", john.getFirstName(), john.getLastName(),john.getAllBalance());
        System.out.printf("Client %s %s has %s", mike.getFirstName(), mike.getLastName(),mike.getAllBalance());

        System.out.println();
        System.out.println(mike.toString() + ", positive balance: " + mike.getPositiveAccountBalance());
        System.out.println(paul.toString() + ", positive balance: " + paul.getPositiveAccountBalance());

        System.out.println();
        System.out.println(paul.toString() + ", negative balance: " + paul.getNegativeAccountBalance());
        System.out.println(john.toString() + ", negative balance: " + john.getNegativeAccountBalance());
    }
}
