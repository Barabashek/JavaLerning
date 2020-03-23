package Grow.ProgrammingWithClasses.ClassesAndObjects.Task08;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        CustomerMethods cm = new CustomerMethods(new ArrayList<>());
        cm.addCustomer("Daniels", "Jack", "Spice", "Austin", 1234456781, 123456);
        cm.addCustomer("Lowson","William", "Original", "Maiami", 321654891, 321654);
        cm.addCustomer("Beam", "Jim", "Apple", "New York", 654987455, 987654);
        cm.addCustomer("Williams", "Evan", "Potato","Wells", 654321454,963852);
        cm.addCustomer("Smirnoff", "Mikhail", "Russia", "Moscow", 444555999, 777777);

        System.out.println("List customers by LastName sort");
        cm.sortByName();
        for (Customer customer : cm.getCustomers())
            System.out.println(customer);

        System.out.println();
        System.out.println("List customers have number card ");
        ArrayList<Customer> customers = cm.customerBankCardSort(500000000, 900000000);
        Collections.sort(customers, ((o1, o2) -> (int) (o1.getCardNumber() - o2.getCardNumber())));
        for (Customer customer : customers)
            System.out.println(customer);
    }
}
