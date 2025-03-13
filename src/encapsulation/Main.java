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

        Customer customer2 = new Customer();
        customer1.setId(3);
        customer1.setFirstName("Baitenir");
        customer1.setEmail("s@gmail.com");
        customer1.setDateOfBirth(LocalDate.of(2004,3,3));
        customer1.setPhoneNumber("+996505664433");

        Customer customer3 = new Customer();
        customer1.setId(4);
        customer1.setFirstName("Test");
        customer1.setEmail("s@gmail.com");
        customer1.setDateOfBirth(LocalDate.of(2004,3,3));
        customer1.setPhoneNumber("+996505664433");


        // TODO  CREATE
        customers = customer.createCustomer(customers,customer);
        customers = customer.createCustomer(customers,customer1);
        customers = customer.createCustomer(customers,customer2);
        customers = customer.createCustomer(customers,customer3);


        // TODO READ
           // getAll
        System.out.println("All Customers: " + Arrays.toString(customer.getAllCustomers(customers)));

          // getById
//        System.out.println("Get By Id Customer:  " + customer.getById(3, customers));

        // TODO UPDATE
//        Customer updateCustomer = new Customer();
//        updateCustomer.setFirstName("Symbat");
//        updateCustomer.setEmail("n@gmail.com");
//        updateCustomer.setPhoneNumber("+996789554433");
//        updateCustomer.setDateOfBirth(LocalDate.of(2003,4,6));

//        System.out.println("UPDATED ARRAY");
//        System.out.println(Arrays.toString(customer.updateCustomerById(2, customers, updateCustomer)));

//        customers = customer.deleteCustomerById(4,customers);

//        System.out.println("All Customers: " + Arrays.toString(customer.getAllCustomers(customers)));

    }
}
