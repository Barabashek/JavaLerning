package Grow.ProgrammingWithClasses.ClassesAndObjects.Task08;

import java.util.ArrayList;
import java.util.Collections;

public class CustomerMethods {
    private ArrayList<Customer> customers;

    public CustomerMethods(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
    public void addCustomer(String lastName, String firstName, String patronymic, String address, long cardNumber, long bankAccount){
        this.customers.add(new Customer(lastName, firstName, patronymic, address, cardNumber, bankAccount));
    }
    public void sortByName(){
        Collections.sort(customers, (o1, o2) -> o1.getLastName().compareToIgnoreCase(o2.getLastName()));
    }

    public ArrayList<Customer> customerBankCardSort(long min, long max){
        ArrayList<Customer> arrayList = new ArrayList<>();
        for(Customer customer : this.customers){
            if ((customer.getCardNumber() >= min) && (customer.getCardNumber() <= max)) {
                arrayList.add(customer);
            }
        }
        return arrayList;
    }
}
