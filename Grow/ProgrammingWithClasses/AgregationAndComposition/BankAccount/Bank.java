package Grow.ProgrammingWithClasses.AgregationAndComposition.BankAccount;

//Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
//всем счетам, имеющим положительный и отрицательный балансы отдельно.

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Client> clients;

    public Bank(String bankName) {
        this.bankName = bankName;
        clients = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public Client getClient(String socialCareNumber){
        for (Client client : clients){
            if (client.getSocialCareNumber().equalsIgnoreCase(socialCareNumber))
                return client;
        }
        return null;
    }
    public void addClient(Client client){
        clients.add(client);
    }
    public void deleteClient(String socialCareNumber){
        clients.stream().filter(client -> client.getSocialCareNumber() == socialCareNumber).forEach(client -> clients.remove(client));
    }
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Bank ");
        builder.append(bankName);
        builder.append(". Number of clients: ");
        builder.append(clients.size());
        return builder.toString();
    }
}
