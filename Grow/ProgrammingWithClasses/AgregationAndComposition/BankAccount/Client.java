package Grow.ProgrammingWithClasses.AgregationAndComposition.BankAccount;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
    private String firstName;
    private String lastName;
    private String socialCareNumber;
    private ArrayList<Account> accounts;

    public Client(String firstName, String lastName, String socialCareNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialCareNumber = socialCareNumber;
        accounts = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialCareNumber() {
        return socialCareNumber;
    }

    public void setSocialCareNumber(String socialCareNumber) {
        this.socialCareNumber = socialCareNumber;
    }
    public String printAccount(){
        String clientAccountInfo = "";
        for (Account account : accounts){
            clientAccountInfo += account.accountInfo();
        }
        return String.format("%s, account %s", toString(), clientAccountInfo);
    }

    public void addAccount(Account account){
        accounts.add(account);
    }
    public void deleteAccount(long accountNumber){
        accounts.stream().filter(account -> account.getAccountNumber() == accountNumber).
                forEach(account -> accounts.remove(account));
    }
    public String getAllBalance(){
        double summaFound = 0;
        StringBuilder builder = new StringBuilder();
        for (Account account : accounts){
            summaFound += account.getAmoundOfFunds();
        }
        builder.append("Amount of Founds");
        builder.append(" in all accounts = ");
        builder.append(summaFound);
        builder.append(" USD\n");
        return builder.toString();
    }
    public String getPositiveAccountBalance(){
        double summaPositiveAccount = 0;
        StringBuilder builder = new StringBuilder();
        for (Account account : accounts){
            if (account.getAmoundOfFunds() > 0){
                summaPositiveAccount += account.getAmoundOfFunds();
            }
        }
        builder.append("Amount of Founds ");
        builder.append("on account with positive balance = ");
        builder.append(summaPositiveAccount);
        builder.append(" USD");
        return builder.toString();
    }

    public String getNegativeAccountBalance(){
        double summaNegativeAccount = 0;
        StringBuilder builder = new StringBuilder();
        for (Account account : accounts){
            if (account.getAmoundOfFunds() < 0){
                summaNegativeAccount += account.getAmoundOfFunds();
            }
        }
        builder.append("Amount of Founds ");
        builder.append("on account with negative balance = ");
        builder.append(summaNegativeAccount);
        builder.append(" USD");
        return builder.toString();
    }

    public void sortAccount(){
            accounts.sort((o1, o2) -> (int) (o1.getAmoundOfFunds() - o2.getAmoundOfFunds()));
    }
    public Account findAccount(long accountID){
        for (Account account : accounts){
            if (account.getAccountID() == accountID)
                return account;
        }
        return null;
    }
    public void lockAccount(long accountID){
        accounts.stream().filter(account -> account.getAccountID() == accountID).forEach(Account::blockAccount);
    }
    public void unlockAccount(long accountNumber){
        accounts.stream().filter(account -> account.getAccountNumber() == accountNumber).forEach(Account::unlockAccount);
    }
    public String toString(){
        return String.format("Client %s %s, social care number: %s\n", firstName, lastName, socialCareNumber);
    }
}
