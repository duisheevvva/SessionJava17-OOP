package encapsulation;

import encapsulation.task1.House;
import encapsulation.task2.Customer;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // TODO DATABASE
        Customer [] customers = new  Customer[0];
        Customer customer = new Customer();
        customer.setId(1);
        customer.setFirstName("Elnura");
        customer.setEmail("el@gmail.com");
        customer.setDateOfBirth(LocalDate.of(2004,3,3));
        customer.setPhoneNumber("+996505664433");

        Customer customer1 = new Customer();
        customer1.setId(2);
        customer1.setFirstName("Sanjar");
        customer1.setEmail("s@gmail.com");
        customer1.setDateOfBirth(LocalDate.of(2004,3,3));
        customer1.setPhoneNumber("+996505664433");

        // TODO  CREATE
        customers = customer.createCustomer(customers,customer);
        customers = customer.createCustomer(customers,customer1);


        // TODO READ
           // getAll
        System.out.println("All Customers: " + Arrays.toString(customer.getAllCustomers(customers)));

          // getById
        System.out.println("Get By Id Customer:  " + customer.getById(3, customers));


    }
}
