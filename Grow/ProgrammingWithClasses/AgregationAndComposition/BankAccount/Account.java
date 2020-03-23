package Grow.ProgrammingWithClasses.AgregationAndComposition.BankAccount;

public class Account {
    private int accountID;
    private long accountNumber;
    private boolean isValid = true;
    private double amoundOfFunds;

    private static int ID = 1;

    public Account(long accountNumber, double amoundOfFunds) {
        this.accountID = ID++;
        this.accountNumber = accountNumber;
        this.amoundOfFunds = amoundOfFunds;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmoundOfFunds() {
        return amoundOfFunds;
    }

    public void setAmoundOfFunds(double amoundOfFunds) {
        this.amoundOfFunds = amoundOfFunds;
    }

    public int getAccountID() {
        return accountID;
    }

    public void blockAccount(){
        isValid = false;
    }
    public void unlockAccount(){
        isValid = true;
    }
    public String accountInfo(){
        return String.format("#%d; Account Number = %d; Amount of Found = %f USD; account status = %s.\n", accountID, accountNumber, amoundOfFunds, isValid);
    }
    public String status(){
        String st = isValid ? "Ok" : "Block";
        String string = String.format("Account %d %s", accountID, st);
        return string;
    }
}
