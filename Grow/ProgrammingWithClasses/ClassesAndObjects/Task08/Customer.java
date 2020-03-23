package Grow.ProgrammingWithClasses.ClassesAndObjects.Task08;

// Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы,
// set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer,
// с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//
// Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//
// Найти и вывести:
// a) список покупателей в алфавитном порядке;
// b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

public class Customer {
    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String address;
    private long cardNumber;
    private long bankAccount;

    private static int idInc = 1;

    public Customer(String lastName, String firstName, String patronymic, String address, long cardNumber, long bankAccount) {
        this.id = idInc++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString(){
        return "Customer: \n" +
                "id: " + id + "; " +
                "Last Name: " + lastName + "; " +
                "First Name: " + firstName + "; " +
                "Patronymic: " + patronymic + "; " +
                "Address: " + address + "; " +
                "Card Number: " + cardNumber + "; " +
                "Bank Account: " + bankAccount + ".";
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public long getBankAccount() {
        return bankAccount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setBankAccount(long bankAccount) {
        this.bankAccount = bankAccount;
    }
}
